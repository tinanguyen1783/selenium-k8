package lab_06;

public class PasswordChecking {
    public static void main(String[] args) {

        String password = "password123";
        StringMethods passChecking = new StringMethods();
        int i = 3;

        System.out.println("Please input your password.");
        while (i > 0) {

            if (passChecking.getPasswordInput().equals(password)) {
                System.out.println("Login successful. ");
                break;
            }
            i--;
            if (i != 0) System.out.println("Please re-input your password.");

        }

        if (i == 0) System.out.println("Your account is blocked.");
    }
}
