//Dina Ashraf
//20216433

class BankAccount {

     public double balance ;
     public String username ;
     public String bankname;
     public final String country = "Egypt" ;
     public int NumOfUsers =0 ;
     public int NumOfcalls =0 ;

     public BankAccount() {
        System.out.println( "Bank account has been created ");
        NumOfUsers ++;
    }
     public BankAccount( double x ,String n , String b) {
        balance = x ;
        username = n ;
        bankname=b;
        NumOfUsers ++;
    }
     public void Deposite (double amount){
        balance += amount ;
        NumOfcalls++;
    }

    public void withdraw (double amount){
        balance -= amount;
        NumOfcalls++;
    }
}

public class Main
{
    public static void main(String[] args) {

        BankAccount acc1=new BankAccount();
        BankAccount acc2=new BankAccount(2000,"Dina","Cairobank");
        acc2.Deposite(500);
        acc2.withdraw(200);
        System.out.println("balance of account is = " +acc2.balance);
        System.out.println("number of calls is = " +acc2.NumOfcalls);
        System.out.println("number of users is = " +acc2.NumOfUsers);
    }
}
