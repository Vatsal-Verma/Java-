import java.util.*;
public class HashMaptest {
    public static void main(String[] args) {
        HashMap<String , Integer> l1 = new HashMap<>();
        l1.put("vatsal",21);
        l1.put("Vijit",22);
        l1.put("Vemra",1);
        System.out.println(l1);
        if(l1.containsKey("vatsal")){
           System.out.println(l1.keySet());
        }
        for(String i:l1.keySet()){
            System.out.println(i+":"+l1.get(i));
        }
    }
}
