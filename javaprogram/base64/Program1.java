import java.io.UnsupportedEncodingException;
import java.util.Base64;

/**
 * 
 */

public class Program1 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        final String textData = "Java8 Base64 Encoding_Decoding";
        // to encode 
        String encodedText = Base64.getUrlEncoder().encodeToString(textData.getBytes("UTF-8"));
        System.out.println(encodedText); // SmF2YTggQmFzZTY0IEVuY29kaW5nX0RlY29kaW5n

        byte[] decodedArr = Base64.getUrlDecoder().decode(encodedText);
        String decodedText = new String(decodedArr, "UTF-8");
        System.out.println(decodedText); // Java8 Base64 Encoding_Decoding


    }
    void simpleEncodingDecoding() throws UnsupportedEncodingException{
        final String textData = "Java8 Base64 Encoding_Decoding";
        // to encode 
        String encodedText = Base64.getEncoder().encodeToString(textData.getBytes("UTF-8"));
        System.out.println(encodedText); // SmF2YTggQmFzZTY0IEVuY29kaW5nX0RlY29kaW5n

        byte[] decodedArr = Base64.getDecoder().decode(encodedText);
        String decodedText = new String(decodedArr, "UTF-8");
        System.out.println(decodedText); // Java8 Base64 Encoding_Decoding

    }   
}
