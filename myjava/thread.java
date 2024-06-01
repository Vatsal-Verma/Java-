import java. lang. *;
import java.util.*;
class Bread {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();
        try{
        for(int i=0;i<n;i++){
            System.out.println(i);
            Thread.sleep(1000);
        }
        }
        catch(Exception e){
            System.out.println(e);
        }
   }
}
