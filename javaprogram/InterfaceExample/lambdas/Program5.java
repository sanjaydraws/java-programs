// lambdas listener 

interface I1 {
    void onClick();
}

class Button {
    void  setOnClickListener(I1 i ){
        System.out.println("button pressed");
    }
}
public class Program5 {
    public static void main(String[] args) {
        Button b1= new Button();

        // anonymous listener 
        b1.setOnClickListener(new I1(){
            @Override
            public void  onClick(){
                System.out.println("success");   
            } 
        });
        

        //lambdas listener 



        // b1.setOnClickListener(i ->{
        //     System.out.println("button was pressed");   
        // });

    }
}
