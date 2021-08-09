// Anoymous class with interface 
// if role of implementor class is only to implement I1 interface , so you can do this way , you don't need to create implementor class 

interface I1{
    void fun1();
}

class Implementor implements I1{
    public void fun1(){
        System.out.println("Implementation of fun1");
    }
}
public class Program2 {
    public static void main(String[] args) {
        // Implementor i1 = new Implementor();
        // i1.fun1(); //Implementation of fun1

        I1 i = new I1(){
            public void fun1(){
                System.out.println("Anonymous implementation");
            }
        };
        i.fun1(); // Anonymous implementation



    }
}
