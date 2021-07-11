


class Animal{  
    String color="white";  
    Animal(){
        System.out.println("Animal Created 1");

    }
    void fun(){
        System.out.println("Hell others ");
    }
} 

class Dog extends Animal{  
    String color="black";  
    Dog(){
        // super();  
        System.out.println("Dog Created ");

    }
    void printColor(){  
       System.out.println(color);//prints color of Dog class  
       System.out.println(super.color);//prints color of Animal class  
       super.fun();

    }  
}  

class Program4{
    public static void main(String[] args) {
        Dog d =new Dog();
        d.printColor();
    }
}