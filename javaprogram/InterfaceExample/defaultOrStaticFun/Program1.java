// default method -> can be overiden by class 
// used to provide common functionality to class 
                 

// static -> belongs to only interface ,can't override by class 
// Interface and implementing class , both can have static method with the same name without overriding each other.

interface MyInterface {
    // abstract method 
    public void fun3 ();

    // static function 
    static void fun1(){
        System.out.println("static function");
    }
    static void fun5(){
        System.out.println("static function5");

    }
    default void fun2(){
        System.out.println("Default Functionality ");
    }
    default void fun4(){
        System.out.println("Default Functionality ");

    }
}


public class Program1 implements MyInterface{

    // can have static function with the same name 
    static void fun1(){
        System.out.println("derkjek");
    }
    @Override
    public void fun3() {
        System.out.println("fun3");
    }
    public static void main(String[] args) {
        Program1 m1 = new Program1();
        // MyInterface.fun2(); can't call defautl method like this 
        m1.fun2(); //Default Functionality 
        // to call  static function 
        MyInterface.fun1(); //static function
        // m1.fun1(); // not worked 


        Program1.fun1();  
        MyInterface.fun5();

    }
}
