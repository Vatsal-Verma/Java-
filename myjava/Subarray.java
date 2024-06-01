import java.util.Scanner;
class Subarray{
	static Scanner s1=new Scanner(System.in);
	public static void main(String ar[]){
		int x[]=new int[100];
		int y[]=new int[100];
		int mul;
		int max;
		int f=0;
	    System.out.println("enter the array:");
		for(int i=0;i<5;i++){
			int a=s1.nextInt();
		}
		for(int i=0;i<5;i++){
			mul=1;
			mul=mul*x[i]*x[i+1];
			y[i]=mul;
		}
		max=y[0];
	    for(int i=0;i<5;i++){
			if(max<y[i]){
				max=y[i];
				System.out.println("Multiplication is:"+max);
				break;
			}
			else{
				System.out.println("highest:"+max);
			}
		}
		
	   
	}
}