import java.util.List;
import java.util.ArrayList;

// updating and remove and get  element
public class Program2 {
    public static void main(String[] args) {

        List<Integer> l1 = new ArrayList<Integer>(); 
        l1.add(1);
        l1.add(11);
        l1.add(1111);
        l1.add(1111);
        l1.add(1111);
        
        // set item at 0th index 
        l1.set(0, 23);
        System.out.println(l1);   //[23, 11, 1111, 1111, 1111]

        // get item 
        System.out.println(l1.get(2)); // 1111

        
        // remove item 
        l1.remove(0);
        l1.remove(0);
        System.out.println(l1); // [1111, 1111, 1111]

        List<String> l2 = new ArrayList<String>(); 
        l2.add("hello");
        l2.add("world");
        l2.add("edr");
        l2.add("ght");
        System.out.println(l2); // [hello, world, edr, ght]
        l2.remove("hello");
        System.out.println(l2); //[world, edr, ght]

    }    
}
