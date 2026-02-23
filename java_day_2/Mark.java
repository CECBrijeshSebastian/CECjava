import java.util.Scanner;
class Mark{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number of Subjects : ");
		int n = sc.nextInt();
		int[] arr = new int[100];
		int total = 0;
		int all_total = (n*50);
		for(int i = 0; i<n; i++){
			System.out.print("\nEnter the mark of Subject "+(i+1)+": ");
			arr[i] = sc.nextInt();
			total += arr[i];
		}
		double percentage = (total * 100.0) / all_total;
		System.out.println("Total Marks : "+total);
		System.out.println("Percentage : "+percentage);	
	}
}
