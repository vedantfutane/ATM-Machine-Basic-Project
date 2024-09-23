import java.util.*;

public class App {
    @SuppressWarnings("resource")
    public class ATM{
        float Balance;
        int PIN= 1234;
        public void checkPin(){
            System.out.println("Enter Your Pin");
            Scanner sc= new Scanner(System.in);
            int enteredPin= sc.nextInt();
            if(enteredPin==PIN){
                menu();
            }else{
                System.out.println("Incorrect Pin");
                checkPin();
            }

        }

        public void menu(){
            System.out.println("Enter Your Choice: ");
            System.out.println("1. Check Accout Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. Exit");

            Scanner sc= new Scanner(System.in);
            int choice=sc.nextInt();

            if(choice==1){
                checkBalance();
            }
            else if(choice==2){
                withdrawMoney();
            }
            else if(choice==3){
                depositMoney();
            }
            else if(choice==4){
                return;
            }
            else{
                System.out.println("Enter the valid choice");
            }
        }

        public void checkBalance(){
            System.out.println("Balance: "+ Balance);
            menu();
        }

        public void withdrawMoney(){
            System.out.println("Enter amount");
            Scanner sc= new Scanner(System.in);
            float amttoWithdraw=sc.nextFloat();
            if(amttoWithdraw<=Balance){
                Balance= Balance-amttoWithdraw;
                System.out.println("Cashout");
            }else{
                System.out.println("Insufficient Balance");
            }
            menu();
        }

        public void depositMoney(){
            System.out.println("Enter the amount to deposit");
            Scanner sc= new Scanner(System.in);
            float amttoDeposit= sc.nextFloat();
            Balance= Balance+amttoDeposit;
            System.out.println("Deposited Successfully");
            menu();
        }


    }
    public static void main(String[] args) throws Exception {
        App app = new App();           // First, create an instance of App
        ATM object1 = app.new ATM();   // Then, use it to create an ATM instance
        object1.checkPin();
        
    }
}
