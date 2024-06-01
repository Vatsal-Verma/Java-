import java.util.Scanner;
class Apple{
	public static void showDisplay(){
		System.out.println("this is apple class");
	}
}
class Ball extends Apple{
	public static void showPro(){
		System.out.println("This is ball class");
	}
}
class InheritDemo{
	public static void main(String ar[]){
		System.out.println("this is main block");
	    Ball b1=new Ball();
		b1.showPro();
		b1.showDisplay();
	
	}
}