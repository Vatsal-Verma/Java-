import java.util.Scanner;
public class Solution {
    static Scanner s1=new Scanner(System.in);
    public static void main(String ar[]) {
       int i,j,c;
       int N=s1.nextInt();
	   int 
       for(i=0;i<N;i++){
           for(j=i+1;j<N;j++){
               if(arr[i]<arr[j]){
                   c=arr[i];
                   arr[i]=arr[j];
                   arr[j]=c;
               }
           }
       }
    }
}