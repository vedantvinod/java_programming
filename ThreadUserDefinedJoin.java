class Demo extends Thread{
    public void run(){
        System.out.println("inside run meathod of"+Thread.currentThread().getName()); 
    }
}
class ThreadUserDefinedJoin{

    public static void main(String arr[]) throws InterruptedException
    {
        System.out.println("inside main meathod"); 
        Demo dobj1= new Demo();
        Demo dobj2= new Demo();
        dobj1.setName("first");
        dobj2.setName("second");
        dobj1.start();
        dobj2.start();
         
        dobj1.join();
        dobj2.join();
        System.out.println("end of main thread");
    }
}