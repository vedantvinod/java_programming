import java.util.*;//star gives all from the util package 

class ExceptionDEmo7{
public static void main(String arr[]){

    Scanner sobj=new Scanner(System.in);

    int ino1=0,ino2=0,ians=0;
    

    System.out.println("enter 1st number");

    ino1= sobj. nextInt();

    System.out.println("enter 2nd  number");

    ino2= sobj. nextInt();
    


    try {
        System.out.println("inside try block");
        ians=ino1/ino2;
    }
    
    //this is not alllowe to write any line inbetween try and catch block 
    //System.out.println("hello");


    catch(ArithmeticException aobj){
        System.out.println("inside catch block");
        System.out.println(aobj);
    }
    catch(Exception eobj){//generic exception
        System.out.println("inside generic catch");
        
    }
    finally{
        System.out.println("inside finally block");
    }

    System.out.println("division is :"+ians);
}
}