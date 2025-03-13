import java.util.Scanner;
abstract class ATM{ //parent class
    double balance;
    ATM(double balance){ //parent class constructor
        this.balance = balance;
    }
    abstract void withdraw(double amount); //withdraw method
    abstract void deposit(double amount); //deposit method
    abstract void checkBalance(); //check balance abstract method
}

class SBI extends ATM{ //child class
    SBI(double balance){ //child class constructor
        super(balance);
    }
    //withdraw method
    void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance -= amount;
            System.out.println("Withdraw success, avl balance: "+balance);
        }else{
            System.out.println("insufficient balance");
        }
    }

    //deposit method
    void deposit(double amount){
        if(amount>0){
            balance += amount;
            System.out.println("Deposit success, avl balance: "+balance);
        }else{
            System.out.println("Invalid amount");
        }
    }

    //check balance method
    void checkBalance(){
        System.out.println("Avl balance: "+balance);
    }
}
public class ATM_Abstraction{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        SBI sbi = new SBI(1000); //balance 1000
        while(true){
            System.out.println("--------ATM MENU--------");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.println("------------------------");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    double amount = sc.nextDouble();
                    sbi.withdraw(amount);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    amount = sc.nextDouble();
                    sbi.deposit(amount);
                    break;
                case 3:
                    sbi.checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using our ATM");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }

        }

        void checkBalance(){
        System.out.println("Avl balance: "+balance);

    }
}
