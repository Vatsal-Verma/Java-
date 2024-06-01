class test1{
	public static void add(int a,int b){
		int c=a+b;
		System.out.println(c);
	}
}
class test2 extends test1{
	public static void main(String ar[]){
		B b=new B();
		b.add(1,2);
}
}