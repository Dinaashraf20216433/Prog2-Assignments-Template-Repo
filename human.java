package BankSystem;

public class human {
    public String Name;
    public int Age;
    public String Gender;

    public human(String n, int a, String g) {
        Name = n;
        Age = a;
        Gender = g;

    }

    void PrintData() {
        System.out.println("Name: " + Name);
        System.out.println("Age: " + Age);
        System.out.println("Gender: " + Gender);
    }

    final void Greet() {
        System.out.println("Good Morning");
    }
}