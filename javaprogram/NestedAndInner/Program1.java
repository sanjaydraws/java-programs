// purpose of nested class to group classes. 
// to define a class within another class  is called a Nested Class.
// Nested Classes are called  if Inner Classes they were declared as non-static

class OuterClass {
    int x = 20;
    void outerFunc(){
        System.out.println("outer class  function");
    }
    class InnerClass {
      int y = 10;
      void innerFunc(){
          System.out.println("Inner class  function");
      }
    }
}


public class Program1 {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        System.out.println(inner.y + outer.x);  // 30
      
    }
}


// If you try to access a private inner class from an outside class, an error occurs:

// Static vs Non Static Nested Classes

// nested static class 
// public class OuterClass1 {
//     private static class StaticNestedClass {
//     }
// }

// public class OuterClass2 {
//     private class NestedClass {
//     }
// }

