public class TakingInput
{
	public static void main(String[] args) {
	    int a=Integer.parseInt(args[0]);
	    int b= Integer.parseInt(args[1]);
	    int c= Integer.parseInt(args[2]);
	    int sum= a+b+c;
	if(a>=40){
		System.out.println("Pass");	
	}
	if(a<40){
		System.out.println("Fail");	
	}
	if(b>=40){
		System.out.println("Pass");	
	}
	if(b<40){
		System.out.println("Fail");	
	}
	if(c>=40){
		System.out.println("Pass");	
	}
	if(c<40){
		System.out.println("Fail");	
	}
	if(sum>=125){
		System.out.println("Pass");	
	}
	if(sum<125){
		System.out.println("Fail");	
	}
}
}