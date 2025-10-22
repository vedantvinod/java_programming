class Demo extends Thread{
    public void run(int no){
        
        if (no==2){
            System.out.println("inside 2nd thread ");
        }
        System.out.println("inside run meathod"); 
    }
}
class ThreadUserDefined2{

    public static void main(String arr[]){
        System.out.println("inside main meathod"); 
        Demo dobj1= new Demo();
        Demo dobj2= new Demo();
        int no=2;
        dobj1.start();
        dobj2.start();
        System.out.println("end of main thread"); 
    }
}