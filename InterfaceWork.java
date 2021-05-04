interface Student{
	void name();
	void rno();
	void marks();
}
interface Study extends Student{
	void avg();
}
interface Sports{
	void playwell();
}
class Praveen implements Student{
	@Override
	public void name(){
		System.out.println("Praveen's name()");
	}
	@Override
	public void rno(){
		System.out.println("Praveen's rno()");
	}
	@Override
	public void marks(){
		System.out.println("Praveen's marks()");
	}
}
class Sam implements Study{
	@Override
	public void avg(){
		System.out.println("Inside Sam we get his avg()");
	}
	@Override
	public void name(){
		System.out.println("Inside Sam we get Praveen's name()");
	}
	@Override
	public void rno(){
		System.out.println("Inside Sam we get Praveen's rno()");
	}
	@Override
	public void marks(){
		System.out.println("Inside Sam we get Praveen's marks()");
	}
}
class John implements Sports,Student{
	@Override
	public void playwell(){
		System.out.println("Inside John we get his playwell()");
	}
	@Override
	public void name(){
		System.out.println("Inside John we get Praveen's name()");
	}
	@Override
	public void rno(){
		System.out.println("Inside John we get Praveen's rno()");
	}
	@Override
	public void marks(){
		System.out.println("Inside John we get Praveen's marks()");
	}
}
class InterfaceWork{
	public static void main(String[] args) {
		Praveen p=new Praveen();
		p.name();
		p.rno();
		p.marks();
		 new Sam().name();
		 new John().marks();
	}
}
