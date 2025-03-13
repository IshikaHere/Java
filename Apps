//implementation of abstraction
import java.util.*;

abstract class Softwares{ //abstract parent class

    String username;
    String password;

    void user_input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username: ");
        username = sc.nextLine();
        System.out.println("Enter password: ");
        password = sc.nextLine();
    }

    void user_login(){
        System.out.println("Welcome to Instagram");
        System.out.println("----------------------");
        System.out.println("Please login here");
    }


    abstract void app_open(); //abstract method


}
class Instagram extends Softwares{ //child class
    @Override
    void app_open(){
        while(true){
            if(username.equals("ishika") && password.equals("password")){ //if string ".equals" operator is used "==" wont work
            System.out.println("Succesfully logged in");
            break;
        }else{
            System.out.println("Invalid username or password");
            user_input();
        }
        }
    }
    void app_close(){
        System.out.println("Instagram is closed");
    }
}


public class Apps{
    public static void main(String[] args){

        Instagram i = new Instagram();
        i.user_login();
        i.user_input();
        i.app_open();

    }
}
