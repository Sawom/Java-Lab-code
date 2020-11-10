package record;
import java.util.ArrayList;
public class UapCse {
    ArrayList<Employee>employees;
    String name;
    public UapCse(String name) {
        employees = new ArrayList<Employee>();
        this.name = name;
    }

    private void addNewEmployee(Employee e){
        employees.add(e);
    }
    void addNewEmployee(String n, String I, String d, double s){
        Employee salariedEmployee = new Employee(n, I, d, s);
        employees.add(salariedEmployee);
    }




    void addNewEmployee(String n, String I, String d, double hr, int hw){
        Employee hourlyEmployee = new Employee(n, I, d, hr);
        employees.add(hourlyEmployee);
    }
    void addNewEmployee(String n, String I, String d, double p, double s){
        Employee commissionEmployee = new Employee(n, I, d, p);
        employees.add(commissionEmployee);
    }



    Employee findEmployee(String id){
        System.out.println("Size = " + employees.size());
        for (Employee employee : employees) {
            if (employee.getid().equals(id)) {
                return employee;
            } 
        }
        return null;
    }
    void increaseSalary(String id, double amt){
        Employee employee = findEmployee(id);
        employee.increaseSalary(amt);
    }
    double getSalary(String id){
        Employee employee = findEmployee(id);
        return employee.getsalary();
    }
    
    void display(String id){
        Employee employee = findEmployee(id);
        if( employee == null) System.out.println("Not exist.");
        else  employee.display();
    }
    void display(){
        for(Employee employee : employees){
            employee.display();
        }
    }
    
}