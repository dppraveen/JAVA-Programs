class SwitchCaseWork{
	public static void main(String[] args) {
		System.out.println("Enter a number");

		int value = new java.util.Scanner(System.in).nextInt();

		final int valueToCheck = 7; //Declare a Constant

		switch(value){
			case 19:
				System.out.println("NINETEEN");
				break;
			case valueToCheck:
				System.out.println("SEVEN");
				break;
			case 15:
				System.out.println("FIFTEEN");
				break;
			default:
				System.out.println("NO MATCH FOUND...");
		}

	}
}
