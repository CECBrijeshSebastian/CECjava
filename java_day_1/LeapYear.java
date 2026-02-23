import java.util.Scanner;
class LeapYear {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Starting Year :");
		int a = sc.nextInt();
		System.out.print("Enter Ending Year :");
		int b = sc.nextInt();
		for( int i = a; i <= b; i++ ){
			if((i%400 == 0) || ((i%4==0) && (i%100!=0)))
			System.out.println("year : "+i);
		}
	}
}
