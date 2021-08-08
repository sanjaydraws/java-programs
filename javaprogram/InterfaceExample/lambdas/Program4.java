import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

// method reference allows to pass static or instance method  that to
// compatible functional interface passed as argument instead of lambda expression 
// Method reference is used to refer method of functional interface. 
// you can use replace lambda expression with method expression 

class Fruit {
    private final String name ;
    public Fruit(String name){
        this.name = name;
    }
    public String getName(){ return name; }

}
public class Program4 {
    public static void main(String[] args) {
        List<Fruit> f = new ArrayList<>();
        f.add(new Fruit("Apple"));
        f.add(new Fruit("Litchi"));
        f.add(new Fruit("Orangle"));

        // instance method reference  or to an  arbitary instance 
        f.stream().map(Fruit::getName);
        // this is equivalent to lambda 
        f.stream().map(fruit -> fruit.getName());


        //Instance method reference (to a specific instance)
        // System.out is instance of Printstream class is passes as an argumetn 
        f.forEach(System.out::println); // people.forEach(person -> System.out.println(person));


        // static method reference 
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        numbers.stream().map(String::valueOf);




    }
}
