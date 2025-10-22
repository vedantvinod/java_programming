import java.util.*;//star gives all from the util package 

class ExceptionDemo5{
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
    catch(ArithmeticException aobj){//specific exception
        System.out.println("inside catch block");
        System.out.println(aobj);
    }
    catch(Exception eobj){//generic exception
        System.out.println("inside generic catch");
        
    }

    System.out.println("division is :"+ians);
}
}