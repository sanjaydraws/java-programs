class OuterClass {
    int x = 30;
  
    static int s1 = 90 ;
    static class InnerClass {
      int y =95;
       void  fun1(){
           System.out.println(s1); // can access static member 
         //  System.out.println(x); //can't access non static 
           
      }
    }
  }
  

public class Program3 {
    public static void main(String[] args) {
        OuterClass.InnerClass myInner = new OuterClass.InnerClass();
        System.out.println(myInner.y);  
        myInner.fun1(); // 90 
    }
}
