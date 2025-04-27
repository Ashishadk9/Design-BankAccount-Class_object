
/**
 * Write a description of class BankAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount
{
 int accountnumber;
 float balance;
 String accountHolderName;
 void insert(int a,String HN,float bal){
     accountnumber = a;
     accountHolderName = HN;
     balance = bal;
 }
 void deposit(float bal){
     balance = balance+bal;
      System.out.println("Deposit: "+bal);
 }
 void withdraw(float bal){
     if(balance<bal){
         System.out.println("Balance is insufficient");
     }else
       balance =balance - bal;
       System.out.println("Withdraw: "+bal);
 }
 void checkBalance() {
     System.out.println("Balance is " + balance);
 }
 void display() {
     System.out.println("\n" +"Account Details: "+"\n" +"AccountNo: "+ accountnumber + "\n" + "Account Name: " + accountHolderName + "\n" +"Amount : " +balance);
 }
 public float getBalance() {
    return balance;
}
 }
 
