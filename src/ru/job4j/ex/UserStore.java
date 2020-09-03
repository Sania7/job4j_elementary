package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User rsl = null;
        for (User user : users) {
            if (login.equals(user.getUsername())) {
                rsl = user;
                break;
            }
        }
        if (rsl == null) {
          throw new UserNotFoundException("Cannot find element with this login");
        }
        return rsl;
    }


    @SuppressWarnings("checkstyle:EmptyLineSeparator")
    public static boolean validate(User user) throws UserInvalidException {
        if ((user.getUsername().length() >= 3) || !(user.isValid())) {
            throw new UserInvalidException("User isn`t valid");
        }
        return true;
    }

    public static void main(String[] args) throws UserNotFoundException {
        User[] users = {
                new User("Petr Arsentev", true),
                new User("q", true)
        };
        try {
            User user = findUser(users, "q");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}

