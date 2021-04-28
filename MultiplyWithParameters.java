class MultiplyWithParameters{
	public static void main(String[] args) {
		java.util.Scanner theScan = new java.util.Scanner(System.in);

		System.out.println("Enter two numbers:");

		int a = theScan.nextInt();	
		int b = theScan.nextInt();

		new MultiplyWithParameters().multiply(a,b);
	}

	void multiply(int a, int b){
		int result = a*b;

		System.out.println("Result is : " + result);
	}
}
