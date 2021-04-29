class VarArg{
  public static void main(String[]args){
    VarArg X=new VarArg();
    System.out.println("addition of numbers:"+x.add(99));
    System.out.println("addition of numbers:"+x.add(67,9,99));
    System.out.println("addition of numbers:"+x.add(67,9));
    System.out.println("addition of numbers:"+x.add());
  }
  int add(int...val){
    int sum=0;
    for(int i:val){
      sum+=i;
    }
    return sum;
  }
}
