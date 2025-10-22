class ThreadPriroty{

    public static void main(String arr[]){

        System.out.println("inside main meathod");
        Thread tobj= Thread.currentThread();
        String name= tobj.getName();
        System.out.println("name of the current thread is :"+name);
        int priroty= tobj.getPriority();
        System.out.println("priroty of the thread is  :"+priroty);


    }.  
