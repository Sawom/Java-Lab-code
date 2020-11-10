package employee;
public class UapHr {
    public static void main(String[] args) {
        Employee emp = new Employee("Abdur Rashid","19101008","Lecturer",56000);
        emp.display();
        emp.updateSalary(61000);
        System.out.println("\nAfter update salary.......\n");
        emp.display();
    }
}
