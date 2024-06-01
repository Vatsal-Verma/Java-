import java.util.HashMap;
import java.util.HashSet;

class Maptest {
    public static void main(String ar[]){
        HashMap<String , Integer> h1 = new HashMap();
        h1.put("vatsal", 1);
        h1.put("vijit" , 2);
        h1.put("verma" , 4);
        h1.put("Aiml",5);
        System.out.println(h1);
        System.out.println(h1.containsKey("vatsal"));
        System.out.println(h1.containsValue(2));
        
    }
}
