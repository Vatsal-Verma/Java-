import java.util.Scanner;

class Vijit{
	public String name;
	public int eno;
	public void inPut(String name,int eno){
		System.out.println(this);
		this.name=name;
		this.eno=eno;
	}
	public void shoW(String name,int eno){
		
		System.out.println(this.name);
		System.out.println(this.eno);
	}
}

class Students{
	static Scanner s1=new Scanner(System.in);
	public static void main(String ar[]){
		Vijit v1=new Vijit();
		
		v1.inPut("Vatsal",1);
		v1.shoW("vijit",2);
		
	}
}