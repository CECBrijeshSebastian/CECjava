import java.util.Scanner;
class ComplexAddition {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter r and i of first complex number :");
		int r1 = sc.nextInt();
		int i1 = sc.nextInt();
		
		System.out.print("Enter r and i of second complex number :");
		int r2 = sc.nextInt();
		int i2 = sc.nextInt();

		r1 = r1+r2;
		i1 = i1+i2;
		System.out.println("Sum = "+r1+"+"+i1+"i");

	}
}
