 interface InterfaceA {  
    public void  callA() ;  
    public void  callB() ;  

}  

public class Program1 {

    public static void main(String[] args) {
        callBackMethod(new InterfaceA(){
            // create callback method 
            public void  callA(){
                System.out.println("it's second callback ");
            }
            public void callB(){
                System.out.println("calling b ");
            }
        });


        // when interface has only one method 
        // callBackMethod(() ->{
        //     System.out.println("it's third callback ");
        // });
        callBackMethod(new InterfaceA(){
            public void callB(){
                System.out.println("calling b ");
            }
            public void  callA(){
                System.out.println("it's second callback ");
            }
        });

    }


    // define callback method 
    public static void  callBackMethod (InterfaceA  obj ){
        obj.callA();
        obj.callB();
    }

}
