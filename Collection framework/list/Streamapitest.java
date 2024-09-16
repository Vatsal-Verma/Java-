import java.util.*;
import java.util.stream.Collectors;

public class Streamapitest {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(12);
        l1.add(1);
        l1.add(14);
        l1.add(122);
        l1.forEach(System.out::println);

        List<Integer>  l2 = (List<Integer>) l1.stream().sorted().distinct().filter(s->s.equals(10)).collect(Collectors.toList());
        System.out.println(l2);
        
    }
}
