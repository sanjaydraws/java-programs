

// Bounded type parameters allow you to set restrictions on generic type arguments:
// class SomeClass {
// }
// class Demo<T extends SomeClass> {
// }
// but a type parameter can only bind  ot single class type 


// An interface type can be bound to a type that already had a binding. This is achieved using the & symbol:
class SomeClass{
    void A(){
        System.out.println("A method in comeclass ");
    }
}
interface MyInterFace{
    void m1();
}
class GenericClass<T extends SomeClass & MyInterFace>{
    public void m1(){
        System.out.println("m1"); 
    }
    void A(){
        System.out.println("A1");
    }
}
class Cat extends SomeClass implements MyInterFace {
    public void m1() {
        System.out.println("m1 in cat");
    }
}
public class Program1
 {
    public static void main(String[] args) {
        GenericClass<Cat> c1 = new GenericClass<Cat> ();
        c1.A();
        c1.m1();
    }
}
