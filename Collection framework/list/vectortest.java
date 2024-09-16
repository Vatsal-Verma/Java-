import java.util.*;
public class vectortest {
    public static void main(String[] args) {
        Vector<Integer> l1 = new Vector<>();
        l1.add(2);
        l1.add(23);
        l1.add(34);
        l1.add(344);
        Iterator<Integer> it = l1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println(l1);
        System.out.println(l1.firstElement());
        System.out.println(l1.lastElement());
    }
}
