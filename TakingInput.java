class TakingInput{
   public static void main(String args[]){
    int a=Integer.parseInt(args[0]);
    int b=Integer.parseInt(args[1]);
    int c=Integer.parseInt(args[2]);   
    int sum =a+b+c;
int result=1;
if(a<40){
	result=0;
}
if(b<40){
	result=0;
}
if(c<40){
	result=0;
}
if(sum<125){
	result=0;
}
if(result==1){
	System.out.println("Student has Passed");
else{
	System.out.println("Student has Failed");
}
}
}
