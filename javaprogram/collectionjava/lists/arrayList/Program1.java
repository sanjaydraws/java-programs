// it's dynamic array 

import java.util.*;

public class Program1 {
    public static void main(String[] args) {
        
        // declare array list with initial size 
        ArrayList<Integer> l1 = new ArrayList<Integer>(3);

        l1.add(90);
        // add element at particular index
        l1.add(0,9);   
        l1.add(1,190); //  
        l1.add(1,190); //  
        System.out.println(l1); //[9, 190, 190, 90]


        // remove elemet at index2 
        l1.remove(3);
        // l1.remove(13); // java.lang.IndexOutOfBoundsException
        System.out.println(l1); // [9, 190, 190]

        // to change  element 
        l1.set(0, 1200);
        System.out.println(l1); // [1200, 190, 190]


        // remove(object ) used to remove object ,first occurence of objects will be removed
        ArrayList<String> l2 = new ArrayList<>();
  
        l2.add("Hash");
        l2.add("Hash1");
        l2.add("Hash");
        l2.add("dev");
        l2.remove("Hash");
        System.out.println(l2); // [Hash1, Hash, dev]

        


        

    }
}
