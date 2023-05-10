package uni.pu.fmi.login.service;

import uni.pu.fmi.models.Participant;

import java.util.Collections;
import java.util.List;

public class LoginService {
    private static List<Participant> participantDb = Collections.singletonList(new Participant("Александър","1234pass","leader"));
    public static String login(final String username, final String password) {
        if (username == null || password == null) {
            return "Въведете име и парола!";
        }
        boolean isParticipantExists = participantDb.stream()
                .anyMatch(u -> u.getUsername().equals(username) && u.getPassword().equals(password));
        return isParticipantExists ? "Успешно влязохте в систематa!" : "Грешни данни!";
    }
}
