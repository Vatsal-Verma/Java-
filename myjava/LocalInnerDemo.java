class Outer{
	public static void showDisplay(){
	class Inner{
		public static void showOut(){
			System.out.println("this is LocalInnerDemo of inner Block");
		}
			
		}
		Inner in=new Inner();
			in.showOut();
	}
}
class LocalInnerDemo{
	public static void main(String ar[]){
	 	Outer ou=new Outer();
	    ou.showDisplay();	
	}
}