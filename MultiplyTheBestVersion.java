class MultiplyTheBestVersion{
	public static void main(String[] args) {

		new MultiplyTheBestVersion().takeInput();
	
	}

	void takeInput(){
		java.util.Scanner theScan = new java.util.Scanner(System.in);

		System.out.println("Enter two numbers to multiply:");

		int firstValue = theScan.nextInt();	
		int secondValue = theScan.nextInt();

		multiply(firstValue, secondValue);

	}


	void multiply(int firstValue, int secondValue){
		
		 displayOutput(firstValue * secondValue);
	}

	void displayOutput(int result){
		System.out.println("Result is : " + result);
	}
}
