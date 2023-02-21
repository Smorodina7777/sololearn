package InnerClasses;

import java.util.Objects;

public class  User3 {
    private static String login, password;
    public static class  Query{
        public void printToLog(){
            System.out.printf("User with %s and %s is sent query\n", login, password);
        }
    }

    public static void initialized(String login, String password) {
        User3.login = login;
        User3.password = password;
    }


    public static void main(String[] args) {
        initialized("login1", "password1");
        User3.Query query1 = new User3.Query();
        query1.printToLog();


    }
}
