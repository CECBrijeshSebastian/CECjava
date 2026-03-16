class Pgm20{
	public static void main(String args[]){
		try{
			int a = 1/0;
		}catch(ArithmeticException e){
			System.out.println("Arithmetic Exception : "+e);
		}

		try{
                        int[] a = new int[4];
			int b = a[10];
                }catch(ArrayIndexOutOfBoundsException e){
                        System.out.println("Array Exception : "+e);
                }

	}
}
