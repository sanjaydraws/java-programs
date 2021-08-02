import java.util.ArrayList;

// lambda expression used to provide the implementation of functional interface (interface that has only one abstract method )
// it's treated as function , compiler will notcreate .class file 

@FunctionalInterface
interface Button2{
   public void  onclick(String name, int i1);
}
@FunctionalInterface

interface Button1 {
    public void onClick();
}
@FunctionalInterface
interface Button3 {
    public void onClick(String name);
}

/**
 * Program2
 */
 public class Program2 {

    public static void main(String[] args) {
        
        // witout lambda expression 
        Button1 b1 = new Button1(){
            public void onClick() {
                System.out.println("button1 onclick implementation");
            }
        };
        b1.onClick(); //button1 onclick implementation

        // using lambda expression 
        // no parameter passed
        Button1 b2 = ()-> System.out.println("button1 onclick implementation using lambda");
        
        b2.onClick();

        // passing multiple parameter 
        Button2 b3 = (name, i1) ->{
            System.out.println(name);

        };
        b3.onclick("button clicked", 1); // button clicked

        // paranthessis can be omitted if have only one argument  
        Button3 b4 = name ->{
            System.out.println(name);

        };

        // for each example 
        ArrayList<String> team = new ArrayList<>();
        team.add("Kohli");
        team.add("Rahul");
        team.add("Bhuvi");

        team.forEach(t -> System.out.println(t));




    }
}