class Cpu{
	
	public static class Processor{
		int cores = 4;
		String manufacturer = "Snapdragon";
		
		public static class Ram{
			int memory = 8;
			String rammanufacturer = "IntelLimited";
			public void displayRam(){
				System.out.println("Ram Memory :"+memory+", Ram manufacturer :"+rammanufacturer);
			}
		}


		Ram ram = new Ram();
		public void displayPro(){
			ram.displayRam();
			System.out.println("Cores :"+cores+", Processor manufacturer :"+manufacturer);
		}


	}

	Processor pro = new Processor();
	void displayCpu(){

		pro.displayPro();
	}	
	
	public static void main(String[] args){
		Cpu cpu = new Cpu();
		cpu.displayCpu();
	}
}
