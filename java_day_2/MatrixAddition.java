import java.util.Scanner;
class MatrixAddition{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows and columns : ");
		int r = sc.nextInt();
		int c = sc.nextInt();
		int [][] A = new int [r][c];
		int [][] B = new int [r][c];
		int [][] C = new int [r][c];
		for(int i = 0; i<r; i++)
		for(int j = 0; j<c; j++){
			System.out.print("Enter value of A["+i+"]["+j+"] :");
			A[i][j] = sc.nextInt();
		}
		for(int i = 0; i<r; i++)
		for(int j = 0; j<c; j++){
			System.out.print("Enter value of B["+i+"]["+j+"] :");
			B[i][j] = sc.nextInt();
		}
		for(int i = 0; i<r; i++){
			for(int j = 0; j<c; j++){
				C[i][j] = B[i][j] + A[i][j];
				System.out.print(C[i][j]+" ");
			}
		System.out.println("");
		}
	}
}
