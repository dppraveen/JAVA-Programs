class ArraysDemo{
	public static void main(String[] args) {

		 java.util.Scanner scan = new java.util.Scanner(System.in);

		 int []arr = new int[5];

		 System.out.println("Enter 5 numbers:");

		for(int index = 0; index < arr.length; index++){
			arr[index] = scan.nextInt();
		}

		// Using Java 5 enhanced for loop
		// for(Variable declaration : Name of Array/Collection){
		// 	Statement/s to be repeated
		// }

		// Traverse using enhanced for loop
		for(int value : arr){
			System.out.println(value);
		}

		// System.out.println("You have entered:");
		// for(int index = 0; index < arr.length; index++){
		// 	System.out.println(arr[index]);
		// }

		// Another type of Array declaration here:

		//char []myCharacterArray = {'a', 't', 'r', 'v'};

		// Yet another way of declaraing arrays:
		//new int[]{56, 89, 222, 7} // Anonnymous Array inline declaration


		




		// arr[0] = 67;
		// arr[5] = 78;
		// arr[9] = 101;

			// System.out.println("Value at index 5 is : " + arr[5]);

		// char []ch;

		// ch = new char[15];
	}
}
