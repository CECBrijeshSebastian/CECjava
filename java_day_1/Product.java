class Product{
	int pcode,price;
	String pname;
	
	Product(int pcode, int price, String pname){
		this.pcode = pcode;
		this.price = price;
		this.pname = pname;
	}
	public static void main(String[] arg){
		Product p1 = new Product(1,10,"Pen");
		Product p2 = new Product(2,5,"Pencil");
		Product p3 = new Product(3,50,"Book");
		Product lowest = p1;
		if(lowest.price > p2.price)
		lowest = p2;
		if(lowest.price>p3.price)
		lowest = p3;
		System.out.println("Product with lowest price");
		System.out.println("Lowest :\npnmae :"+lowest.pname + "\npcode : " + lowest.pcode + "\nprice : " + lowest.price);
		
	}
	
}

