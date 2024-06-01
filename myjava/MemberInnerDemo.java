class Outer{
	class Inner{
		public static void showDisplay(){
			System.out.println("\nthis is Inner Block of the class showDisplay");
		}
	}
}
class MemberInnerClass{
	public static void main(String ar[]){
		Outer ou=new Outer();
		Outer.Inner in=ou.new Inner();
		in.showDisplay();
	}
}