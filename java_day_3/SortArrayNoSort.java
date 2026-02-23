import java.util.Scanner;
class SortArrayNoSort{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String str ;
		System.out.print("Enter a String...");
			str=sc.nextLine();

			char [] strarr = str.toCharArray();

		for(int i = 0; i<strarr.length;i++)
			for(int j = 0;j<(strarr.length-i-1);j++){

				if(strarr[j]>strarr[j+1]){
					char temp = strarr[j];
					strarr[j] = strarr[j+1];
					strarr[j+1] = temp;
				}
			}
	
		for(int i = 0; i<strarr.length;i++)
			System.out.print(strarr[i]);
	}
}
