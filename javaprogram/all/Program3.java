// abstract class 


abstract  class Bike{
    Bike(){
        System.out.println("Bike is created");
    }
    abstract void run();
    void changeGear(){
        System.out.println("Gear changed");
    }
}

class Honda extends Bike{
    void run(){
        System.out.println("Running safely");
    }
}

class Program3{
    public static void main(String[] args) {
        Bike ref = new Honda();
        ref.changeGear();
        ref.run();

    }
}

