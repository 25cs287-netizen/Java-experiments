abstract class Employee {

    static String company = "ABC Company";
    public String department;
    private double salary;
    protected String designation;
    String location;
    
    Employee(String department, double salary,
             String designation, String location) {

        this.department = department;
        this.designation = designation;
        this.salary = salary;
        this.location = location;
    }
    
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    abstract void displayRole();
    void displayDetails() {
        System.out.println("Company: " + company);
        System.out.println("Department: " + department);
        System.out.println("Designation: " + designation);
        System.out.println("Location: " + location);
    }
}
class Developer extends Employee {

    Developer(String department, double salary,
              String designation, String location) {

        super(department, salary, designation, location);
    }
    void displayRole() {
        System.out.println("Role: Software Developer");
    }
}
public class Exp2 {

    public static void main(String[] args) {

        Developer emp = new Developer(
            "CSE",
            20000,
            "Senior Developer",
            "Tiruppur"
        );

        emp.displayDetails();
        emp.displayRole();

        System.out.println("Initial Salary: " + emp.getSalary());

        emp.setSalary(30000);

        System.out.println("Updated Salary: " + emp.getSalary());
    }
}
