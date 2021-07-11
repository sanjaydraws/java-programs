
interface Bank {
    float rateOfInterest();
}

class SBI implements Bank{
   public float rateOfInterest(){
       return 9.15f;
   }
   public void  fun1(){
       System.out.println("SBI functionality");
   }
}
class PNB implements Bank{
    public float rateOfInterest(){
        return 9.15f;
    }
    public void  fun2(){
        System.out.println("PNB functionality");
    }
 }
class Program2 {
    public static void main(String[] args){
        Bank b = new SBI();
        System.out.println(b.rateOfInterest());
        //  b.fun1();

        SBI s1 = new SBI();
        s1.fun1();

    }
    
}
