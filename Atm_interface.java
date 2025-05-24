
import java.util.Scanner;

class BankAccount{
    private double balance;

    public BankAccount(double IB) {
        balance =IB;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        balance = balance+amount;
    }
    public boolean withdraw(double amount){
        if(amount <=balance){
            balance -=amount;
            return true;
            }else{
                return false;
            }
        }
 }

 class ATM{
    private BankAccount account;
    public ATM(BankAccount account){
        this.account=account;

    }
    public void displayMenu(){
        System.out.println("WELCOME TO THE ATM");
        System.out.println("1.CHECK YOUR BALANCE");
        System.out.println("2.DEPOSIT");
        System.out.println("3.WITHDRAW THE AMOUNT");
        System.out.println("4.EXIT");
    }
    public void PT(){
        Scanner sc=new Scanner(System.in);
        int choice;
        double amount;
        while(true){
            displayMenu();
            System.out.println("enter your choice : ");
            choice =sc.nextInt();
                 switch(choice){
                    case 1:
                    System.out.println("your bank balance is : rs. "+ account.getBalance());
                    break;
                    case 2:
                    System.out.println("Enter deposit amount: rs. ");
                    amount=sc.nextDouble();
                    if (amount>0){
                        account.deposit(amount);
                        System.out.println("Deposit Successful ");
                    
                    }else{
                        System.out.println("Invalid deposit amount.");
                    }
                    break;
                    case 3:
                    System.out.println("Enter withdrawl amount: rs.");
                    amount=sc.nextDouble();
                    if(amount>0&& account.withdraw(amount)){
                        System.out.println("withdraw Successful.");
                    }else{
                        System.out.println("Invalid withdrawl amoubt or insufficient amount");
                    }
                    break;
                    case 4:
                    System.out.println("Thank you for using Atm.");
                    return;
                    default:
                    System.out.println("Please enter valid choice.try again");
                 }
        }
    }
 }

 public class Atm_interface{
    public static void main(String[] args) {
        BankAccount userAccount=new BankAccount(10000000);
        ATM atm=new ATM(userAccount);
        atm.PT();
    }
 }