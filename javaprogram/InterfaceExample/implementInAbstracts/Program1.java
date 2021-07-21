// implementing interface in abstracts class 

// in interface method is by default public abstract 
// when abstract class implemen interfacet a method which are defined in interface we don't need to implement 
// This is because a class that is declared abstract can contain abstract method declarations. 
// It is therefore the responsibility of the first concrete sub-class to implement any abstract methods inherited from any interfaces
// and/or the abstract class.



// From Java 8 onward it is possible for an interface to declare default implementations of methods which means
// the method won't be abstract, therefore any concrete sub-classes will not be forced to implement the method but
// will inherit the default implementation unless overridden.
interface Test {
    void test();
}
abstract class Fruit implements Test{
    //Does not need to declare or implement test()
    public abstract void color();

}
//Because Orange is concrete, it must define both test() and color()
class Orange extends Fruit{
    public void color(){
        System.out.println("Yellow color");;
    }
    public void test(){
        System.out.println("sour ");;
    }
}
public class Program1 {
    public static void main(String[] args) {
        Orange o1 = new Orange();
        o1.color();//Yellow color
        o1.test();// sour
    }
}
