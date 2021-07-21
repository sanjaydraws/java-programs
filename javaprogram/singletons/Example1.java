// in oops signleton class is a class that can have only one object at a time 
//if create new intance ,it also point to first instance 
// to design singleton 
// 1. make constructor as private 
// 2. write static fun that return type  object of this singleton class


class Singleton {
    private static Singleton instance ;

    public int prop = 900;
    // private constructor 
    private Singleton(){
        System.out.println("it private constructor ");
    }
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

}

public class Example1 {
    public static void main(String[] args) {
        // Singleton s1= new Singleton();  // will not work this 
        Singleton s1 = Singleton.getInstance();
        System.out.println(s1.prop);
        Singleton s2 = Singleton.getInstance(); // it also point to same instance as s1 
        System.out.println(s2.prop);

        // now change prop value it reflects in both, because both points to same object 
        s2.prop = 800 ;
        System.out.println(s1.prop); // 800
        System.out.println(s2.prop);

        
        // referenceid
        System.out.println(s1); // Singleton@5ca881b5
        System.out.println(s2);//Singleton@5ca881b5

        
        
    }   
}
