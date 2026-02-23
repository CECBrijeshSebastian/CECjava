import java.util.*;
class SortArray{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String [] str = new String[4];
		System.out.print("Enter 4 String...");
		for(int i=0;i<4;i++)
			str[i]=sc.nextLine();
		Arrays.sort(str);
		for(int i=0;i<4;i++)
			System.out.print(str[i]+" , ");
	}
}
