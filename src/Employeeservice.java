
import java.util.HashSet;
import java.util.Scanner;
public class Employeeservice{
	
	HashSet<Employee> empset=new HashSet<Employee>();
	
	Employee empl1=new Employee(101, "Seeta", 24, "Devops Eng", "Admin", 5000);
	Employee empl2=new Employee(102, "Mahi", 30, "Developer", "IT", 25000);
	Employee empl3=new Employee(103, "Dhoni", 27, "Tester", "CO", 50000);
	Employee empl4=new Employee(104, "Virat", 25, "Deveops Eng", "Admin", 15000);
	
	Scanner sc=new Scanner(System.in);
	boolean found=false;
	
	int id;
	String name;
	int age;
	String department;
	String desiganation;
	double salary;
	
	public Employeeservice() {
		
		empset.add(empl1);
		empset.add(empl2);
		empset.add(empl3);
		empset.add(empl4);
		
		
	}
	//view all employees
	public void viewAllEmployee() {
		for(Employee empl:empset) {
			System.out.println(empl);
		}
	}
	//add Employee
	public void addEmployee() {
		System.out.println("Enter id:");
		id=sc.nextInt();
		System.out.println("Enter name");
		name=sc.next();
		System.out.println("Enter age");
		age=sc.nextInt();
		System.out.println("Enter desiganation");
		desiganation=sc.next();
		System.out.println("Enter department");
		department=sc.next();
		System.out.println("enter salary");
		salary=sc.nextInt();
		
		Employee empl=new Employee(id,name,age,desiganation,department,salary);
		
		empset.add(empl);
		System.out.println(empl);
		System.out.println("Employee added successfully");	
	}
	//delete Employee
	public void deleteEmployee() {
		System.out.println("Enter id");
		id=sc.nextInt();
		boolean found=false;
		Employee empldelete=null;
		for(Employee empl:empset) {
			if(empl.getId()==id) {
				System.out.println("Employee is not present");
			}
		}
		if(!found) {
			System.out.println("Employee is not present");
		}else {
			empset.remove(empldelete);
			System.out.println("Employee deleted sucessfully!!");
		}	
		}
	//view Employee based on Id
	public void viewEmployee() {
		System.out.println("Enter id:");
		id=sc.nextInt();
		for(Employee empl:empset) {
			if(empl.getId()==id) {
				System.out.println(empl);
				found=true;
			}
		}
		if(!found) {
			System.out.println("Employee with this Id is not present");
		}
	}
	//update the Employee
	public void updateEmployee() {
		System.out.println("Enter id:");
		id=sc.nextInt();
		boolean found=false;
		for(Employee empl:empset) {
			if(empl.getId()==id) {
				System.out.println("Enter name:");
				name=sc.next();
				System.out.println("Enter Age:");
				age=sc.nextInt();
				System.out.println("Enter new salary");
				salary=sc.nextDouble();
				empl.setName(name);
				empl.setAge(age);
				empl.setSalary(salary);
				System.out.println("Updated Details of Employee are:");
				System.out.println(empl);
				found=true;
			}
		}
		if(!found) {
			System.out.println("Employee is not present");
		}else {
			System.out.println("Employee details updated successfully!!");
		}
	}	
}

