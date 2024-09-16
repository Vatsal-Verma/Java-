class Vatsal extends Thread{
    public void run(){
        try{
            String a = Thread.currentThread().getName();
            for(int i=0;i<5;i++){
                System.out.println(a);
            }
            Thread.sleep(1000);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
class Threadnaming{
    public static void main(String[] args) {
        Vatsal thread1 = new Vatsal();
        Vatsal thread2 = new Vatsal();
        Vatsal thread3 = new Vatsal();
    
        thread1.setName("thread1");
        thread2.setName("thread2");
        thread3.setName("thread3");
        
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

