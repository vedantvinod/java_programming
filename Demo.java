import java.util.Scanner;

class Addition{
    public int i=0;
    public int j=0;
    public int sum=0;
    public int additionofnumbers(int i,int j){
        sum=i+j;
        return sum;

    }
}

class Demo {
    public static void main(String arr[]){
        Scanner sobj=new Scanner(System.in);
        int ino1=0;

        int ino2=0;
        int iret=0;
        System.out.println("enter first number");
        ino1= sobj. nextInt();
        System.out.println("enter second number");
        ino2= sobj. nextInt();
        Addition aobj=new Addition();
        iret=aobj.additionofnumbers(ino1,ino2);
        System.out.println("additio is "+iret);


        



    } 
}