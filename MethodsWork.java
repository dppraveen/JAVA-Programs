import java.util.Scanner;
class MethodsWork{
	public static void main(String[] args) {
		Scanner theScan = new Scanner(System.in);

		System.out.println("Enter two numbers to multiply:");

		int firstNum = theScan.nextInt();	
		int secondNum = theScan.nextInt();	

		int result = firstNum * secondNum;

		System.out.println("Multiplication of numbers is : " + result);
	}
}
