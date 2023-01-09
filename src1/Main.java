package src1;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        int code = Authentication.authenticate();
        if (code == 0) {
            System.out.println("Login success");
        } else {
            System.out.println("Login failed");
        }

    }
}
