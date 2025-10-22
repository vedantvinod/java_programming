import java.util.Scanner;


class Dynamic{
    public static void main(String A[]){

        Scanner sobj =new Scanner(System.in);

        int length=0;
        int arr[];
        System.out.println("enter the no of elements");

        length= sobj.nextInt();

        arr= new int [length];

        if (arr==null){
            System.out.println("memory is not allocated");

    
        }
        else {

            System.out.println("memory is allocataed");

        }

        arr=null;
        System.gc();



    }

}