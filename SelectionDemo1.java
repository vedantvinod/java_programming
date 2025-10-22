import java.util.Scanner;

class SelectionDemo1{

    public static void main(String a[]){

        int iNo = 0;

        Scanner sobj =new Scanner(System.in);

        System.out.println("enter your age :");

        iNo = sobj.nextInt();

        if (iNo>=18){

            System.out.println("ypu can vote :");

        }
        else{

            System.out.println("you cant vote :");
        }


    }
}