import java.util.Scanner;

class SwitchDemo{

    public static void main(String a[]){

        int istd = 0;

        Scanner sobj =new Scanner(System.in);

        System.out.println("enter your standered  :");

        istd = sobj.nextInt();

        switch (std){

            case 1:
            System.out.println("your exam time is 9am   :");
            break;
            case 2:
            System.out.println("your exam time is 10 am   :");
            break;
            case 3:
            System.out.println("your exam time is 11 am   :");
            break;
            case 4:
            System.out.println("your exam time is 12pm  :");
            break;

            default:
            
            System.out.println("invalid class :");
            
        
        }

        
    }
}