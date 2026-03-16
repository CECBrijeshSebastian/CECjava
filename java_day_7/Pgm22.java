import java.util.Scanner;
class Table5 extends Thread{
	int n;
	Table5(int n){
		this.n = n;
	}
	public void run(){
		for(int i=1;i<=n;i++)
			System.out.println(i+"*5 = "+(i*5));
	}
}

class PrimeN extends Thread{
    int n;

    PrimeN(int n){
        this.n = n;
    }

    public void run(){
        for(int i=2;i<=n;i++){
            int f = 0; 

            for(int j=2;j<=i/2;j++){
                if(i%j == 0){
                    f = 1;
                    break;
                }
            }

            if(f==0)
                System.out.println("prime : "+i);
        }
    }
}

class Pgm22{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N : ");
		int n = sc.nextInt();
		//int n =10;
		Table5 t1 = new Table5(n);
		PrimeN p1 = new PrimeN(n);
		t1.start();
		p1.start();
	}
}
