package javaExample.method_refrence;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**

 1. Reference to Static Method
 Syntax: Class::staticMethodName
 2. Refrence to instance Method
 object::methodName
 3. Refrence to instance Method From class type
 Class::methodName
 4. Refrence to construtor
 Class::new.
 * */
public class Program1 {
    public static void main(String[] args) {

        // 1. Reference to Static Method
        List<Integer> numbers = Arrays.asList(2,34,5,5);
        numbers.forEach(System.out::print);


        // 2. Refrence to instance Method
        System.out.println();
        String str   = "Hello World";
        System.out.println(str.substring(2)); // llo World


        Function<Integer, String > converter = str::substring;
        System.out.println(converter.apply(2)); // llo World

        //3 Reference to an Instance Method of a Class Type:
        List<String> names1 = Arrays.asList("John", "Jane", "Doe");
        names1.sort((s1, s2) -> s1.compareToIgnoreCase(s2));

        List<String> names2 = Arrays.asList("John", "Jane", "Doe");
        names2.sort(String::compareToIgnoreCase);







    }
}
