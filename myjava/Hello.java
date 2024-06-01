class Vijit{
	public void display(){
		System.out.println("this is display of Vijit");
	}
}
class Vatsal{
	public Vatsal(){
		System.out.println("hello");
	}
    public void display(){
        System.out.println("this is display of Vatsal");
    }
}
class HelloWorld {
    public static void main(String[] args) {
        Vatsal a = new Vatsal();
		Vijit b = new Vijit();
        a.display();
		b.display();
    }
}