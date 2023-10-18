package javaExample.lambdas;


import java.util.function.BiFunction;
import java.util.function.Function;

interface TriFunction<A, B, C, R>{
    R apply(A a, B b, C c);
}

@FunctionalInterface
interface MyFunction{
    int operate(int a ,int b);
}

public class Program2 {
    Function<Integer, Integer> square = (num) -> num * num ;

    BiFunction<Integer, Integer, Integer> sum = (a, b) -> {
        int total = a + b;
        return total;
    };

    static int run (int x, int y, MyFunction myFunc){
        return myFunc.operate(x,y);
    }

    public static void main(String[] args) {
        TriFunction<Integer, Integer, Integer, Integer> sum = (a, b,c) ->  a + b + c;

        int result = sum.apply(10,20,30);
        System.out.println(result);

        run(34,56,(a,b) -> {
            System.out.println(34);
            return a  + b ;
        });


    }
}