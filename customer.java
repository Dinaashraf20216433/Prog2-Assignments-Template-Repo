package BankSystem;

public class customer extends human {
    private String SSN;
    private String address;
    private Bankaccount bankAccount;

    public customer(String n, int a, String g, String SSN, String address) {
        super(n, a, g);
        this.SSN = SSN;
        this.address = address;
        bankAccount = new Bankaccount();
    }
}
