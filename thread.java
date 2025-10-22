class printing{

     

    public void demo(int no){
         int i;
        if(no==1){
            

            for(i=0;i<=4;i++)
             {
            System.out.println("name ping is printed by"+Thread.currentThread().getName());
            
             }

        }
        if (no==2){

            for(i=0;i<=4;i++)
            {
            System.out.println("name pong is printed by"+Thread.currentThread().getName());
            }
        }
    }

    
}

class print extends Thread{

    public  printing  obj;
    public int no;

    public print(printing t,int a,String name){
        obj=t;
        no=a;
        setName(name);

    

    }

    public void run(){
        obj.demo(no);

    }
}

class thread{
    public static void main(String arr[])
    {
        printing obj=new printing();

        print pobj1=new print(obj,1,"first");
        print pobj2=new print(obj,2,"second");


        

try{    pobj1.start();
        pobj2.start();
        pobj1.join();
        pobj1.join();
}
catch(Exception e){


}

    }
}