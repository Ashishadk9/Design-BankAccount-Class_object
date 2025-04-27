
/**
 * Write a description of class BankSystem here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankSystem
{
    public static void main(String[] args){
        BankAccount johnAccount = new BankAccount();
        BankAccount janeAccount = new BankAccount();
        
        johnAccount.insert(001,"John Doe",500.0f);
        janeAccount.insert(002,"Jane Smith",1000.0f);
         System.out.println("John's Account Transactions:");
        johnAccount.deposit(200.0f);
        johnAccount.withdraw(100.0f);
        
        System.out.println("\nAppling 2% interest to jane's account");
        float interest = janeAccount.getBalance() * 0.02f;
        janeAccount.deposit(interest);
        System.out.println("Interest earned: $" + interest);
        
        System.out.println("\nFinal Account Details:");
        johnAccount.display();
        janeAccount.display();
    }
}
