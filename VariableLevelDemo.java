class VariableLevelDemo{
	
	int var;

	boolean b;
	VariableLevelDemo temp;

	public static void main(String[] args) {

		// VariableLevelDemo ref = new VariableLevelDemo();
		// VariableLevelDemo anotherRef = new VariableLevelDemo();

		// ref.var = 45;

		// int myFlag; //Local variable now

		// // System.out.println("myFlag : " + myFlag); //Error

		// System.out.println("Value of b is : " + anotherRef.var);

		for(int v = 3; v > 10; v++){
			System.out.println(v);
		}
		System.out.println(v); //Error

	}

	void doSomething(){
		// myFlag = 89; //Undefined symbol - Error
		int value;
	}

	void met(){
		char ch;
	}

}
