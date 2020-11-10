package employee;
public class Employee {
     String name;
     String id;
     String designation;
     double salary;
    
      public Employee(String name,String id,String designation,double salary){
        this.name=name;
        this.id=id;
        this.designation = designation;
        this.salary = salary;
    }
    
    void updateSalary(double newSal){
        this.salary = newSal;
    }
    
    double getSalary(){
        return this.salary;
    }
    
    void display(){
        System.out.println("Name = "+name);
        System.out.println("Id = "+id);
        System.out.println("Designation = "+designation);
        System.out.println("Salary = "+salary);
    }
}
