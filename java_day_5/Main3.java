abstract class Area{
	abstract void area();
}

class Rectangle extends Area{
	int l,b;
	Rectangle(int l,int b){
		this.l = l;
		this.b = b;
	}
	void area(){
		System.out.println("Area of Rectangle : "+(l*b));
	}
}

class Circle extends Area{
        int r;
        Circle(int r){
                this.r = r;
        }
        void area(){
                System.out.println("Area of Circle : "+(2*3.14*r));
        }
}

class Square extends Area{
        int l,b;
        Square(int l){
                this.l = l;
        }
        void area(){
                System.out.println("Area of Square : "+(l*l));
        }
}

class Main3{
	public static void main(String [] args){
		Area rec = new Rectangle(2,3);
		Area cir = new Circle(5);
		Area sq = new Square(4);
		rec.area();
		cir.area();
		sq.area();
	}
}
