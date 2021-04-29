class Some{
	int var;
	public static void main(String[] args) {
		Some ref = new Some();
		ref.func();
		System.out.println(ref.var);
	}


	void func(){
		this.var = 675; 
		met(); //this.met();

		// temp = new Some();
		// // ref.var = 90;//Fails
		// temp.var = 865;
		// return temp;
	}

	void met(){
		System.out.println("Inside met...");
	}
}
