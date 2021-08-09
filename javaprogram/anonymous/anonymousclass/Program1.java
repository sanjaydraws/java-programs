// anonymous inner class can be used in two ways
// 1  if the purpose of class is only to iverride method ex  purpose of creating B class to verride fun1 
// in this case you don't need to create B class 



class A{
    void fun1(){
        System.out.println("fun1 in A ");
    }
}
class B extends A{
    void fun1(){
        System.out.println("fun1 in B");
    }
}



public class Program1
{
    public static void main(String[] args) {
        // A a = new B();
        // a.fun1(); //fun1 in B

        A obj = new A(){
            void fun1() {
                System.out.println("Anonumous Overidden method ");
            }
            // can't create 
            // void fun2(){
            //     System.out.println("fun2 method ");
            // }
        };
        obj.fun1(); // Anonymous Overidden method 
    }    
}
