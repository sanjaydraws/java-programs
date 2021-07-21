import java.nio.channels.Channel;

 interface IO <IncomingType, OutgoingType>{
    void publish(OutgoingType data );
    IncomingType consume();
    IncomingType RPCSubmit(OutgoingType data);
}

/**
 * Program1
 */
public class Program1 {

    public static void main(String[] args) {
   //         Now I can instantiate that interface, but since we don't have default implementations for those methods, it'll need
   // an implementation when we instantiate it:
   IO<String, String> mockIO = new IO<String, String> (){
       private String channel = "some channel";

       public void publish(String data ){
           System.out.println("publishing "+data + "to " + channel);
       }
       public String consume(){
        System.out.println("consuming data to " + channel);
        return "Some usefull data ";
       }
       public String RPCSubmit(String data){
        return "received " +data+ "to " + channel;
       }
    };
    mockIO.consume();
    mockIO.publish("Test Data");
    System.out.println(mockIO.RPCSubmit("Test Data"));

    }
}

// When implementing multiple interfaces, you can't implement the same interface twice. That also applies to generic
// interfaces. Thus, the following code is invalid, and will result in a compile error:
// interface Printer<T> {
// void print(T value);
// }
// // Invalid!
// class SystemPrinter implements Printer<Double>, Printer<Integer> {
// @Override public void print(Double d){ System.out.println("Decimal: " + d); }
// @Override public void print(Integer i){ System.out.println("Discrete: " + i); }