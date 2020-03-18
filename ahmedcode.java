import java.util.Scanner;
import java.util.Random;

class CustomerAccount
{


    private String CustomerName;
    private String TypeOfAccount;
    private long AccountNumber;
    private double CurrentBalance;
    public double amount =700;

    public CustomerAccount(String CustomerName,String TypeOfAccount,long AccountNumber,double CurrentBalance)
    {
        this.CustomerName = CustomerName;
        this.TypeOfAccount = TypeOfAccount;
        this.AccountNumber = AccountNumber;
        this.CurrentBalance = CurrentBalance;
    }
   
    public void debit(double amount){
        if(amount < CurrentBalance){
            if(amount>0){
                amount=amount*-1;
            }
            else{
               
            }
           amount =CurrentBalance - amount;
            System.out.println("Complete the transaction of account no "+AccountNumber);
        }
        else {
            System.out.println("Error on the amount your CurrentBalance is less then amount you wants to withdraw " + CurrentBalance + " > " + amount);
        }
        // return CurrentBalance;
    }
    public void credit(double amount){
        if(amount > 0){
            amount= CurrentBalance + amount;
            System.out.println("Complete the transaction of account no "+AccountNumber);
        }
        else{
            System.out.println("Error on the amount "+amount+" must be greater than 0");
        }
    }
    public void withdraw(double amount){
        if(amount < CurrentBalance){
            if(amount>0){
                amount=amount*-1;
            }
            else{
               
            }
            amount = CurrentBalance - amount;
            System.out.println("Complete the transaction of account no "+AccountNumber);
        }
        else{
            System.out.println("Error on the amount your CurrentBalance is less then amount you wants to withdraw "+CurrentBalance+" < "+amount);
        }
    }
    public void getDetail(int no){
      System.out.println("\t\t\tUser No "+no);
      System.out.println("Customer Name is "+CustomerName);
      System.out.println("Type Of Account of Mr."+CustomerName+" is "+TypeOfAccount);
      System.out.println("Account Number of Mr."+CustomerName+" is "+AccountNumber);
      System.out.println("Current Balance of Account Number "+AccountNumber+" is "+amount+"\n");
    }
}


public class ahmedcode
{
    public static void main (String[]args)
    {
        Random rng = new Random();


        double amount =700; 

        long UserAcoountNo_1 = (Long) (rng.nextLong() % 10000L) + 5200L;
        long UserAcoountNo_2 = (Long) (rng.nextLong() % 10000L) + 5200L;
        long UserAcoountNo_3 = (Long) (rng.nextLong() % 10000L) + 5200L;
        long UserAcoountNo_4 = (Long) (rng.nextLong() % 10000L) + 5200L;
       
        if(UserAcoountNo_1<0){
            UserAcoountNo_1=UserAcoountNo_1*-1;
        }
        else{
           
        }
        if(UserAcoountNo_2<0){
            UserAcoountNo_2=UserAcoountNo_2*-1;
        }
        else{
           
        }
        if(UserAcoountNo_3<0){
            UserAcoountNo_3=UserAcoountNo_3*-1;
        }
        else{
           
        }

       
       
        CustomerAccount User1 = new CustomerAccount("John","hello",UserAcoountNo_1,50000);
        User1.getDetail(1);
       
        CustomerAccount User2 = new CustomerAccount("Jack","man",UserAcoountNo_2,8000);
        User2.getDetail(2);
       
        CustomerAccount User3 = new CustomerAccount("Jason","can",UserAcoountNo_3,9000);
        User3.getDetail(3);
       
       
        
       
        User1.credit(amount);
        User2.withdraw(amount);
        User3.debit(amount);
    }
}