package BankSystem;

final class Bankaccount {
    private double balance ;

    public double getBalance() {
        return balance + balance * 0.1;

    }

    public void setBalance(double balance) {
        if (balance >=0 || balance <=100000){
            this.balance +=balance;
        }
    }
    public void setBalance(double balance, double Tax ){
        this.balance += balance - (balance * (Tax/100));
    }

}

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Dina", 20, "female", 5000, "IT");
        employee.PrintData();
        System.out.println("Salary: " + employee.getSalary());
        System.out.println("Department: " + employee.getDepartment());

        customer customer = new customer("Dina", 22, "female", "123456789", "New cairo");

        Bankaccount Bank = new Bankaccount();
        Bank.setBalance(2000);
        Bankaccount Bank2 = new Bankaccount();
        Bank.setBalance(2000,10);
        System.out.println(Bank.getBalance());
        System.out.println(Bank2.getBalance());
    }
}
