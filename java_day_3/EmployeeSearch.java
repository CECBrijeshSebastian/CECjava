import java.util.Scanner;
class Employee{
	public int eno, salary;
	public String ename;
	Employee(int eno,String ename,int Salary){
		if(eno ==0 || ename == "" || Salary == 0)
			System.out.print("Argument Exception.....!!!!");
		this.eno = eno;
		this.ename = ename;
		this.salary = Salary;
	}

}

class EmployeeSearch{
public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Number of objects");
	int n = sc.nextInt();
	Employee [] emp = new Employee[n];
	for(int i = 0;i<n;i++){
		System.out.println("Object "+i+" : ");
		System.out.print("Enter Name of employee "+i+" : ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Enter eno of employee "+i+" : ");
		int eno = sc.nextInt();
		System.out.print("Enter salary of employee "+i+" : ");
		int salary = sc.nextInt();
		emp[i] = new Employee(eno,name,salary);
	}

	System.out.print("Enter id of employee to search : ");
	int key = sc.nextInt();
	for(int i = 0;i<n;i++){
		if(emp[i].eno == key){
			System.out.println(key+" user name is "+emp[i].ename);
			return;
		}
	}

	System.out.println("User not found...!");
}
}
