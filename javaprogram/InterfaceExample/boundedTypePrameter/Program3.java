// multiple bounds 
// bounded type Bounded type parameters can be used with methods as well as classes and interfaces.
// <T extends superClassName & Interface>

// can't have more than one class in multiple bounds 

class Bound<T extends M & I>
{
    private T ref ;
    public Bound(T objRef){
        this.ref = objRef;
    }
    public void test(){
        this.ref.showClass();
    }
} 
interface I{
    public void showClass();
}
class M implements I{
    public void showClass(){
        System.out.print("Inside super class M");
    }
}
class M1 extends M implements I {
    public void showClass(){
        System.out.print("Inside super class M");
    }
}
public class Program3 {
    public static void main(String[] args) {
        Bound<M> b1 = new Bound<M>(new M());
        b1.test(); // Inside super class M
        
    }
    
}
