
//// is alive
class Demo extends Thread{
    public void run(){
        System.out.println("inside run meathod of"+Thread.currentThread().getName()); 
    }
}
class ThreadUserDefinedSerialAlive{

    public static void main(String arr[]) 
    {
        System.out.println("inside main meathod"); 
        Demo dobj1= new Demo();
        Demo dobj2= new Demo();
        dobj1.setName("first");
        dobj2.setName("second");
        try {
            dobj1.start(); 
                 dobj1.join();

            System.out.println("end of first thread ");
            System.out.println("is first thread alive? "+dobj1.isAlive());
            dobj2.start();
            System.out.println("end of Second thread ");
                 dobj2.join();
         }
         catch(InterruptedException aobj){

         }
        System.out.println("end of main thread");
    }
}