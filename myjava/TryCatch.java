import java.util.Scanner;
class TryCatch{
	static Scanner s1=new Scanner(System.in);
	public static void main(String ar[]){
	System.out.println("enter the number:");
	int a=s1.nextInt();
	try{
	    System.out.println(""+5/0);
	}
	catch(Exception e){
		System.out.println(e);
	}
	System.out.println("This is excecited after except blocks");
	}
}