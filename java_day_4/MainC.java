import java.util.Scanner;

class Employee{
    String dept;
    String [] sub;

    Employee(String dept, String[] sub){
        this.dept = dept;
        this.sub = sub;
    }
}

class Teacher extends Employee{
    Teacher(String dept, String [] sub){
        super(dept,sub);
    }

    void display(){
        System.out.println("Department is " + super.dept);
        for(int i = 0; i < super.sub.length; i++){
            System.out.println("Subject : " + super.sub[i]);
        }
    }
}

class MainC{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter How many Teachers : ");
        int nt = sc.nextInt();

        Teacher[] teachers = new Teacher[nt];

        for(int i = 0; i < nt; i++){
            sc.nextLine();  

            System.out.print("Enter Dept name : ");
            String dept = sc.nextLine();

            System.out.print("How many Subjects : ");
            int sn = sc.nextInt();
            sc.nextLine(); 

            String[] sub = new String[sn];

            for(int j = 0; j < sn; j++){
                System.out.print("Subject " + (j+1) + " : ");
                sub[j] = sc.nextLine();
            }

            teachers[i] = new Teacher(dept, sub);
        }

        for(int i = 0; i < nt; i++){
            teachers[i].display();
        }

        sc.close();
    }
}
