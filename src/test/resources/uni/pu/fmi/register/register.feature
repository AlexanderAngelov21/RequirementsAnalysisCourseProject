Feature: Регистрация на участник

  Scenario Outline: Регистрация на участник
    Given Участникът отваря екрана за регистрация
    When Въведе потребителско име "<username>"
    And Въведе парола "<password>" в полето парола
    And Въведе парола "<password2>" в полето за втора парола
    And Въведе роля "<role>" в полето за роля
    And Натиска бутона за регистрация
    Then Вижда съобщение "<message>"

    Examples:
      | username  |  password | password2  | role     |   message                    |
      | ivan      |Pass124345!| Pass124345!| leader   | Регистрирахте се успешно!    |
      |           |Pass124345!| Pass124345!| regular  | Въведете потребителско име!  |
      | ivan      |Pass       | Pass       | regular  | Паролата трябва да е по-дълга от четири символа!    |
      | ivan      |           |            | regular  | Паролата трябва да е по-дълга от четири символа!    |
      | ivan      |Pass124345!| 124345!Pass| regular  | Въведете еднакви пароли!     |
      | iva       |Pass124345!| Pass124345!|          | Въведете роля!               |