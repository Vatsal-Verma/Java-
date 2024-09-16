import java.util.*;
class iteratortest{
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(78);
        Iterator<Integer> it = l1.iterator();
        while(it.hasNext()){
            System.out.println(it.next()+" ");
        }
    }
}