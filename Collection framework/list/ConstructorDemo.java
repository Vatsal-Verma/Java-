// package Collection framework.list;
class Test{
    String name; 
    int id;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    Test(String name, int id){
        this.name=name;
        this.id=id;
    }
}
public class ConstructorDemo {
public static void main(String[] args) {
    Test t = new Test("vatsal",12);
    System.out.println(t.getName() + " " + t.getId());
}
    
}
