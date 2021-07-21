
interface Fruit <T, X>{
    T name(T data );
    X getTest(X data);
    void  getDetails(T data ,X test);
}


public class Program2
 {
    public static void main(String[] args) {
          // Now I can instantiate that interface, but since we don't have default implementations for those methods, it'll need
   // an implementation when we instantiate it:
   Fruit<String, String> o1  = new Fruit<String,String>(){
    public String name(String data) {
        return data;
    }
    public String getTest(String data) {
        return data;
    }
    public void getDetails(String data, String test) {
        System.out.println(data + " is " + test );
    }};
    System.out.println(o1.name("Orange")); // Orange
    System.out.println(o1.getTest("Great Test")); //Great Test
    o1.getDetails("Orange", "sour"); // Orange is sour
 
    }
}
