import java.util.*;//star gives all from the util package 

class ExceptionDemo2{
public static void main(String arr[]){

    Scanner sobj=new Scanner(System.in);

    int ino1=0,ino2=0;
    float fans=0.0f;

    System.out.println("enter 1st number");

    ino1= sobj. nextInt();

    System.out.println("enter 2nd  number");

    ino2= sobj. nextInt();

    fans=(float)ino1/(float)ino2;

    System.out.println("division is :"+fans);
}
}