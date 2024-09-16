import java.util.*;
public class LinkedListtest {
    public static void main(String[] args) {
        List<Integer> l1=new LinkedList<>();
        l1.add(12);
        l1.add(14);
        l1.add(123);
        l1.add(13);
        Iterator<Integer> it=l1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        l1.add(1,2);
        System.out.println(l1);
     }
}
