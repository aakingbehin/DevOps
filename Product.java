class Product{

	public static void main(String[] args){
		System.out.println("before break");
		TEST_BREAK:
		
		if(true){ 
			break Test_break;
			System.out.println("in break");
		}
		System.out.println("out break");
		
	}

}
