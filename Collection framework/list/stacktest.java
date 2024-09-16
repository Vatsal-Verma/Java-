import java.util.*;
public class stacktest {
    public static void main(String[] args) {
        Stack<Integer> l1 = new Stack<>();
        l1.push(12);
        l1.push(13);
        l1.push(144);
        l1.push(1);
        System.out.println(l1);
        l1.pop();
        System.out.println(l1.peek());
        System.out.println(l1.isEmpty());
    }
}
