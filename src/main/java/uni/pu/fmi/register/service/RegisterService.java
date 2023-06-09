package uni.pu.fmi.register.service;
import java.util.ArrayList;
import java.util.List;


import uni.pu.fmi.models.Participant;
public class RegisterService {

    private static final List<Participant> participantDB = new ArrayList<>();




    public static String register(final String username, final String firstPassword, final String secondPassord, final String role
    ) {
        initDb();
        if (null == username || username.trim().equals("")) {
            return "Въведете потребителско име!";
        }

        if (null == role || role.trim().equals("")) {
            return "Въведете роля!";
        }


        if (firstPassword == null || 5 > firstPassword.length()) {
            return "Паролата трябва да е по-дълга от четири символа!";
        }

        if (!firstPassword.equals(secondPassord)) {
            return "Въведете еднакви пароли!";
        }

        final Participant newParticipant = new Participant(username, firstPassword,role);
        boolean isParticipantExists = participantDB.stream().anyMatch(u -> u.equals(newParticipant));
        if (isParticipantExists) {
            return "Потребителското име е заето!";
        }

        participantDB.add(newParticipant);
        return "Регистрирахте се успешно!";
    }

    private static void initDb(){
        participantDB.clear();
        participantDB.add(new Participant("ivan123", "Pass124345!","leader"));
    }



}