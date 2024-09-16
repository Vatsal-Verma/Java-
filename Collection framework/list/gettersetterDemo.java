// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Test{
    private String name;
    private String id;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
}
class gettersetterDemo{
    public static void main(String[] args) {
        Test t = new Test();
        t.setName("Vatsal");
        System.out.println(t.getName());
    }
}