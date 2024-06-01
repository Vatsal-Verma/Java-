class apple{
	private int name,no;
	void show(int name,int no){
		System.out.println("name:"+name);
		System.out.println("no+"+no);
	}
}
class ball extends apple{
    void display(){
		System.out.println("this is display");
	}
}
class oops2{
	public static void main(String ar[]){
		ball b1=new ball();
		b1.display();
		b1.show(1,2);
	}
}