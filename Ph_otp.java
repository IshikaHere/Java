import java.util.*;

abstract class Softwares { // Abstract parent class
    String username;
    String password;
    int otp;

    void user_input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username: ");
        username = sc.nextLine();
        System.out.println("Enter password: ");
        password = sc.nextLine();
    }

    void user_login() {
        System.out.println("Welcome to WhatsApp");
        System.out.println("----------------------");
        System.out.println("Please login here");
    }

    abstract void app_open(); // Abstract method
}

// WhatsApp Class with OTP login
class WhatsApp extends Softwares {

    void otp_input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter OTP sent to your phone: ");
        otp = sc.nextInt();
    }

    @Override
    void app_open() {
        if (username.equals("ishika") && password.equals("password")) {
            System.out.println("OTP Sent! (Assuming OTP is 1234)");
            otp_input();

            while (otp != 1234) { // Simulating OTP verification
                System.out.println("Invalid OTP, please try again.");
                otp_input();
            }

            System.out.println("Successfully logged in to WhatsApp");
        } else {
            System.out.println("Invalid username or password");
        }
    }

    void app_close() {
        System.out.println("WhatsApp is closed");
    }
}

public class Ph_otp {
    public static void main(String[] args) {
        WhatsApp whatsapp = new WhatsApp();
        whatsapp.user_login();
        whatsapp.user_input();
        whatsapp.app_open();
        whatsapp.app_close();
    }
}

