import java.util.ArrayList;
import java.util.List;

// list to store ordered collection 
// child interface of collection 
// dublicate value can be store 

public class Program1 {
    public static void main(String[] args) {
        // List  can not be instantiated
        // List<Integer> l1 = new List<Integer>();       
        List<Integer> l1 = new ArrayList<Integer>(); 
        // it will not override value it shifts value if any present on that index
        l1.add(0, 1);
        l1.add(0,2); 
        l1.add(0,22); 

        System.out.println(l1); // [22, 2, 1]

        List<Integer> l2 = new ArrayList<Integer>(); 
        l2.add(1);
        l2.add(11);
        l2.add(1111);
        System.out.println(l2); // [1, 11, 1111]



        // put l1 values in 0 index other values will shilft 
        l2.addAll(0, l1);  
        System.out.println(l2); //  [22, 2, 1, 1, 11, 1111]

        

    }
    
}
