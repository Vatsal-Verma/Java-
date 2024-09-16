import java.util.Base64;

public class base64 {
    public static void main(String[] args) {
        String OriginalString = "vatsal is a good boy";
        String encodedString = Base64.getEncoder().encodeToString(OriginalString.getBytes());
        System.out.println(encodedString);
        byte[] Decode = Base64.getDecoder().decode(encodedString);
        String decodeString = new String(Decode);
        System.out.println(decodeString);
    }
}
