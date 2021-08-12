// iterating over list 
import java.util.List;
import java.util.ArrayList;

public class Program3 {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();

        l1.add(2);
        l1.add(23);
        l1.add(1, 900);
        // using get method 
        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i) + " "); // 2 900 23  
        }   // 

        System.out.println(" \n" );
        // using foreach 
        for (Integer i : l1) {
            System.out.println(" " + i);  // 2 , 900 ,23
        }


    }
}
