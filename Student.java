class Student{         //Class Program 
  public static void main(String[] args){
    Marks m=new Marks();
    m.m1=90;
    m.m2=95;
    m.m3=90;
    m.total();
    m.avg();
  }
}
class Marks{
  int m1,m2,m3,sum;
  void total(){
    sum=m1+m2+m3;
    System.out.println("Total is:"+sum);
  }
  void avg(){
    int mean=sum/3;
    System.out.println("Avg is:"+mean);
  }
}
