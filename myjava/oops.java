import java.util.Scanner;
class ball{
	public static void show(String name,int no){
		System.out.println("name is"+name);
		System.out.println("Number is"+no);
	}
}
class apple extends ball{
	public static void display(string ){
		System.out.println("this is display");
	}
}
class oops{
	public static void main(String ar[]){
		apple a1=new apple();
		a1.display();
		a1.show("vatsal",12);
	}
}