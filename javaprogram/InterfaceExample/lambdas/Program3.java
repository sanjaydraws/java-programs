import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Animal{
    String name ;
    String getName(){
        return name;
    }
}

// using lambdas to sort a collection 
public class Program3 {
    List<Animal> animal  = new ArrayList<>();
    Collections.sort(people,(p1, p2) 
      -> p1.getFirstName().compareTo(p2.getFirstName())
      );

}
