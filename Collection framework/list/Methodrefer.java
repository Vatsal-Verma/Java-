// import java.lang.*;
class Methodrefer{
   public static void Threadstatus(){
      System.out.println("thread is running");
   }
   public static void main(String[] args) {
        Thread t2 = new Thread(Methodrefer::Threadstatus);
        t2.start();
   }
}