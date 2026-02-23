import java.util.Scanner;
class Symmetric{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int r = sc.nextInt();
		System.out.print("Enter number of columns : ");
		int c = sc.nextInt();
		if(r != c){
			System.out.print("Not Symmetric Matrix");
			return;
		}
		int [][] A = new int [r][c];
		for(int i = 0; i<r; i++)
		for(int j = 0; j<c; j++){
			System.out.print("Enter value of A["+(i+1)+"]["+(j+1)+"] :");
			A[i][j] = sc.nextInt();
		}
		int f = 0;
		for(int i = 0; i<r; i++){
			for(int j = 0; j<c; j++){
				if (A[i][j] != A[j][i]){
					f = 1;
					break;
				}
			}
		}
		if(f == 1)
		System.out.println("Not Symmetric Matrix   ");
		else
		System.out.println("Symmetric Matrix   ");

		for(int i = 0; i<r; i++){
			for(int j = 0; j<c; j++){
				System.out.print(A[i][j]+" ");
			}
		System.out.println("");
		}
	}
}
