import java.util.Scanner;
class Table5 implements Runnable{
	int n;
	Table5(int n){
		this.n = n;
	}
	int a = 0;
        int b = 1;
	public void run(){
		for (int i = 0; a <=n; i++) {
    			System.out.println("Fibonaci : "+a);
    			int next = a + b;
    			a = b;
   			b = next;

		}
	}
}

class PrimeN implements Runnable{
    int n;

    PrimeN(int n){
        this.n = n;
    }

    public void run(){
	    for(int i = 1; i<=n; i++)
            if(i%2 == 0)
                System.out.println("Even : "+i);
    }
}


class Pgm23{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N : ");
		int n = sc.nextInt();
		//int n =10;
		Thread t1 = new Thread(new Table5(n));
		Thread t2 = new Thread(new PrimeN(n));
		t1.start();
		t2.start();
	}
}

