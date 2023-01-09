package src1;

import java.util.Scanner;

public class Authentication {
    private static final String LOGIN = "Старые Пидоры";
    private static final String PASSWORD = "2020 vhq";

    public Authentication() {
    }

    public static int authenticate() {
        Scanner s = new Scanner(System.in);
        int maxCount = 3;

        boolean isLoginSuccess;
        for(isLoginSuccess = false; maxCount > 0 && !isLoginSuccess; --maxCount) {
            System.out.println("Login: ");
            String login = s.nextLine();
            System.out.println("Password: ");
            String password = s.nextLine();
            if (login.equals("Старые Пидоры") && password.equals("2020 vhq")) {
                isLoginSuccess = true;
            }
        }

        return isLoginSuccess ? 0 : -1;
    }
}
