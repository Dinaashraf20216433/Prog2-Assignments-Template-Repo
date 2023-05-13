package BankSystem;

class Employee extends human {
    private double Salary;
    private String Department;

    public Employee(String n, int a, String g, double s, String d) {
        super(n, a, g);
        Salary = s;
        Department = d;
    }

    void PrintData() {
        super.PrintData();
        System.out.println("Salary: " + Salary);
        System.out.println("Department: " + Department);
    }
    public double getSalary() {
        return Salary;
    }

    public String getDepartment() {
        return Department;
    }
}
