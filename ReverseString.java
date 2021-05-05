import java.util.Scanner;
class ReverseString{
	public static void main(String[] args) {
		String s,str="";
		Scanner a=new Scanner(System.in);
		s=a.nextLine();
		int n=s.length();
		for(int i=n-1;i>=0;i--){
			str+=s.charAt(i);
		}
			System.out.println("reversed string is:"+str);
	}
}
