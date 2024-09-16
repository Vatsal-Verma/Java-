import java.util.*;
public class SortingTest {
    public static void main(String[] args) {
        // ArrayList<Integer> l1 = new ArrayList<>();
        // l1.add(12);
        // l1.add(14);
        // l1.add(2);
        // l1.add(6);
        // Collections.sort(l1);
        // System.out.println(l1);
        int a[] = {5,4,3,3,1,5,6,3,2,6,7,0};
        Arrays.sort(a);
        // a.forEach();
        for(int i:a){
            System.out.println(i);
        }
    }
    
}
