

// / This class only accepts type parametes as any class
// which extends class M or class M itself.
// Passing any other type will cause compiler time error
  
// restricted to only type of M class or its'sub class 
class Bound <T extends M>
{
    private T objRefreence;
    public Bound(T objRef){
        this.objRefreence = objRef;
    } 
    
    public void testMethod(){
        this.objRefreence.showClass();

    }
}

class M {
    public void showClass(){
        System.out.println("inside super class M Class ");
    }
}
class M1 extends M{
    public void showClass(){
        System.out.println("inside sub class M1 Class ");
    }
}
class M2 extends M{
    public void showClass(){
        System.out.println("inside sub class M2 Class ");
    }
}

public class Program2
 {
    public static void main(String[] args) {
        // create an object of subclass M2 and passing it to bound as a type parameter 
        Bound<M2> b2 = new Bound<M2>(new M2());
        b2.testMethod(); // inside sub class M2 Class

        // passing super class M
        Bound<M> b = new Bound<M> (new M());
        b.testMethod();  // inside super class M Class 

        // passing sub class M1 
        Bound<M1> b1 = new Bound<M1>(new M1());
        b1.testMethod(); // inside sub class M1 Class
    }
}
