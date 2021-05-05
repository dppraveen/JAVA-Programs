import java.util.Scanner;
class Palindrome{
	public static void main(String[] args) {
		String s,str="";
		Scanner a=new Scanner(System.in);
		s=a.nextLine();
		int n=s.length();
		for(int i=n-1;i>=0;i--){
			str+=s.charAt(i);
		}
		if(s.equals(str)){
			System.out.println("It is Palindrome");
		}
		else{
			System.out.println("It is not Palindrome");
		}
		}
}
