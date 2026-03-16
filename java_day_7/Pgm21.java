import java.util.Scanner;
class NegativeNumberException extends Exception{
	NegativeNumberException(String msg){
		super(msg);
	}
}

class Pgm21{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total number of elements : ");
		int n = sc.nextInt();
		int t = 0;
		for(int i=0;i<n;i++){
		try{
			System.out.println("Enter Number"+(i+1)+": ");
			int a = sc.nextInt();
			if(a<0){
				i--;
				throw new NegativeNumberException("Only Positive Number Accepted");
			}
			t = t+a;
		}catch(Exception e){
			System.out.println("Exception : "+e);
		}
		}
		System.out.println("Average is "+(t/n));
	}
}
