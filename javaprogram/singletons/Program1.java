// singleton is class tha thas only one single instance 

// version > java SE 5
// enum singleton 
public enum Program1 {
    INSTANCE;
    public void execute (String arg){
        // perform option here 
        System.out.print("performing option on "+arg);
        System.out.print("\nperforming option on "+INSTANCE);

    }
    public static void main(String[] args) {
        INSTANCE.execute("singletons ");
    }
}



 
