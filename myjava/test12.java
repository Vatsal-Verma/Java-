import java.util.Scanner;

class Students{
	static Scanner s1=new Scanner(System.in);
	static void studMul(){
		int s=0;
	int n=s1.nextInt();
	for(int i=2)
		if(s==n)
			System.out.println("NO");
	

	}
	public static void main(String ar[]){
	    System.out.println("\nenter the number of test cases:s");
		int t=s1.nextInt();
		for(int i=1;i<=t;i++){
			studMul();
		}
		
		
	}
}