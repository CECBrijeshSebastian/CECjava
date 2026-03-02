import java.util.Scanner;
class Person{
	private String name,gender, address,age;
	Person(String name,String gender, String address, String age){
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.age = age;
	}
	void display(){
		System.out.println("Name of Person :"+this.name);
		System.out.println("Gender of Person :"+this.gender);
		System.out.println("Address of Person :"+this.address);
		System.out.println("Age of Person :"+this.age);
	}
}

class Employee extends Person{
	private String empid,company_name,qualification;
	Employee(String name,String gender, String address, String age,String empid,String company_name,String qualification){
		super(name,gender, address,age);
		this.empid = empid;
		this.company_name = company_name;
		this.qualification = qualification;
	}
	void display(){
		super.display();
                System.out.println("EmployeeId Of Employee :"+this.empid);
                System.out.println("Company Name :"+this.company_name);
                System.out.println("Qualification of Employee :"+this.qualification);
        }
}

class Teacher extends Employee{
	private String subject, trid, department;
	Teacher(String name,String gender, String address, String age,String empid,String company_name,String qualification,String subject, String trid,String department){

		super(name,gender,address,age,empid,company_name,qualification);
		this.subject = subject;
		this.trid = trid;
		this.department = department;
	}
	void display(){
                super.display();
                System.out.println("Subject :"+this.subject);
                System.out.println("Teacher Id :"+this.trid);
                System.out.println("Department :"+this.department);
        }
}


class Main1{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of Employee : ");
		int num = sc.nextInt(); 
		Teacher[] emp = new Teacher[num];
		for(int i = 0;i<num; i++){
			sc.nextLine();
			System.out.println("Enter name :");
			String name = sc.nextLine();
			System.out.println("Enter gender :");
			String gender = sc.nextLine();
			System.out.println("Enter address :");
                        String address = sc.nextLine();
			System.out.println("Enter age :");
                        String age = sc.nextLine();
			System.out.println("Enter empid :");
                        String empid = sc.nextLine();
			System.out.println("Enter Company Name :");
                        String company_name = sc.nextLine();
			System.out.println("Enter qualification :");
                        String qualification = sc.nextLine();
			System.out.println("Enter Subject :");
                        String subject = sc.nextLine();
			System.out.println("Enter Teacher ID :");
                        String trid = sc.nextLine();
			System.out.println("Enter Department :");
                        String department = sc.nextLine();
			emp[i] = new Teacher(name,gender,address,age,empid,company_name,qualification,subject,trid,department);
		}
		for(int i = 0;i<num; i++){
			emp[i].display();
		}
		
	}

}
