// when inner class is static you don' need to create outerclass object 

class OuterClass {
    int x = 90;
  
    static class InnerClass {
      int y = 25;
    }
}

public class Program2 {
    public static void main(String[] args) {
        OuterClass.InnerClass myInner = new OuterClass.InnerClass();
        System.out.println(myInner.y); // 25 
    }
}
