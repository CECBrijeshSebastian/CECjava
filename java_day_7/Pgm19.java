import java.util.Scanner;
interface Shape{
	double area();
	double perimeter();

}

class Rectangle implements Shape{
	double length;
	double breadth;
	Rectangle(double length, double breadth){
		this.length=length;
		this.breadth = breadth;
	}
	public double area(){
		return (length*breadth);
	}
	public double perimeter(){
		return 2*(length+breadth);
	}
}

class Circle implements Shape{
        double radius;
        Circle(double radius){
                this.radius = radius;
        }
        public double area(){
                return 3.14*radius*radius;
        }
        public double perimeter(){
                return 3.14*radius*2;
        }
}

class Pgm19{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Circle ci;
		Rectangle re;
		System.out.println("Enter Length of Rectangle : ");
		double l = sc.nextDouble();
		System.out.println("Enter Breadth of Rectangle : ");
                double b = sc.nextDouble();
		System.out.println("Enter Radius of Circle : ");
                double r = sc.nextDouble();
		ci = new Circle(r);
		re = new Rectangle(l,b);
		System.out.println("Area of rectangle is "+re.area());
		System.out.println("Perimeter of Rectangle is "+re.perimeter());
		System.out.println("Area of Circle is "+ci.area());
	       	System.out.println("Perimeter of Circle is "+ci.perimeter());

	}
}
