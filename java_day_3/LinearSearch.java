import java.util.Scanner;
class LinearSearch{
	public static void main(String [] args){
		System.out.print("Enter the size of th array : ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int [] arr = new int[size];
		System.out.println("Enter elements...");
		for(int i = 0;i<size;i++)
			arr[i] = sc.nextInt();
		System.out.print("Enter Key..");
		int key = sc.nextInt();
		int f = 0;
		for(int i = 0;i<size;i++)
			if(arr[i] == key){
				f = i;
				break;
			}
		if(f != 0)
			System.out.println("Key found at position "+f);
		else
			System.out.println("Key not found");
	}
}
