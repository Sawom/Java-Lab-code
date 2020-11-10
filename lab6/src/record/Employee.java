package record;
public class Employee {
	private String name;
	private String id;
	private String designation ;
	private double salary;
	
	Employee(String name,String id,String designation,double salary){
		this.name=name;
		this.id=id;
		this.designation=designation;
		this.salary=salary;
	}
	
	public void setname(String name) {
		this.name=name;
	}
	
	public String getname() {
		return name;
	}
	
	public void setdesignation(String designation) {
		this.designation=designation;
	}
	
	public String getdesignation() {
		return designation;
	}
	
	public void setid(String id) {
		this.id = id;
	}
	
	public String getid() {
		return id;
	}
	
	public double getsalary(){
		return salary;
	}
	
	void increaseSalary(double amt) {
		this.salary=this.salary+amt;
	}
	
	void display() {
		System.out.println("Name:  "+getname()+"Id  "+getid()+"Designation: "+getdesignation()+"Salary:  "+getsalary() );
	}
}
