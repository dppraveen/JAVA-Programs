import java.util.Scanner;
class MultiplyNumbersUsingMethods{
	public static void main(String[] args) {
		new MultiplyNumbersUsingMethods().multiply();
	}

	void multiply(){
		Scanner theScan = new Scanner(System.in);

		System.out.println("Enter two numbers to multiply:");

		int firstNum = theScan.nextInt();	
		int secondNum = theScan.nextInt();	

		int result = firstNum * secondNum;

		System.out.println("Multiplication of numbers is : " + result);
	}
}
