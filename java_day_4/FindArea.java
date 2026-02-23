import java.util.Scanner;
class FindArea{
	void area(int a){
		System.out.println("Area of Square : "+a*a);
	}
	void area(int a,int b){
                System.out.println("Area of Rectangle : "+a*b);
        }
	void area(float r){
                System.out.println("Area of Circle : "+3.14*r*r);
        }
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		FindArea mo = new FindArea();
		System.out.print("Enter one Side of Square :");
		int a = sc.nextInt();
		mo.area(a);
		System.out.print("Enter Length of rectangle :");
                a = sc.nextInt();
		System.out.print("Enter Breadth of Rectangle :");
                int b = sc.nextInt();
                mo.area(a,b);

		System.out.print("Enter Radius of the circle :");
                float r = sc.nextFloat();
                mo.area(r);


	}
}
