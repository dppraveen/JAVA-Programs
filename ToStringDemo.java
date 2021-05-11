
class Employee{
	private String empName, empSkills;

	Employee(String empName, String empSkills){
		this.empName = empName;
		this.empSkills = empSkills;
	}

	public String getEmpName(){
		return this.empName;
	}

	public String getEmpSkills(){
		return this.empSkills;
	}

	@Override
	public String toString(){
		return "Hi, I am " + this.getEmpName() + ", and I already have an understanding on " + this.getEmpSkills(); 
	}
}

class ToStringDemo{
	public static void main(String[] args) {
		Employee theEmployee = new Employee("Stephy", "Java, HTML, SQL");
		Employee theEmployeeSecond = new Employee("Prashant", "C++, Algorithms, Data Structures");
		Employee theEmployeeThird = new Employee("Anusha", "C++, Logical Blocks, Iterative Statements");

		System.out.println(theEmployee);
		System.out.println(theEmployeeThird);
		System.out.println(theEmployeeSecond);
	}
}
