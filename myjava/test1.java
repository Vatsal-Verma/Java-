import java.util.Scanner;

class Students{
	static Scanner s1=new Scanner(System.in);
	static void studMul(){
		int s=0;
	int n=s1.nextInt();
	for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++){
			for(int k=1;k<=n;k++){
	            
			  if((i*j*k)==n&&i>2&&j>2&&k>2){
				  s=1;
				  System.out.println(i+" "+j+" "+k);
				  break;
			  }
			}
		}
	}
		if(s==0)
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