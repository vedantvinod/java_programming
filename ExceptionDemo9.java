import java.util.*;//star gives all from the util package 

class ExceptionDemo9{
    {

    Scanner sobj=new Scanner(System.in);

    int Arr[]={10,20,30,40,50};
    int iIndex=0;
    int iData=0;
    

    

    System.out.println("enter the index number");

    iIndex= sobj. nextInt();
    iData=Arr[iIndex];//exception prone code

    System.out.println("element at that index is :"+Arr[iIndex]);
    close();
    

}
    
}