import java.util.*;//star gives all from the util package 

class ExceptionDemo10{
public static void main(String arr[]){

    Scanner sobj=new Scanner(System.in);

    int brr[]={10,20,30,40,50};
    int iIndex=0;
    int iData=0;
    
    System.out.println("enter the index number");

    iIndex= sobj. nextInt();
    try{
        System.out.println("inside try");
    iData=Arr[iIndex];//exception prone code
    }
    catch(Exception eobj){
        System.out.println("inside catch");
        System.out.println(eobj);
    }
    finally{
        System.out.println("inside finally");
       
    }
    System.out.println("element at that index is :"+Arr[iIndex]);
    
}
    
}