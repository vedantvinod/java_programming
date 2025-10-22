class Arithmatic{
    public int ino1;
    public int ino2;
    public static int no3= 30;

    public Arithmatic(){

        this.ino1=0;
        this.ino2=0;
        

    }
    public Arithmatic (int i,int j){
        this.ino1=i;
        this.ino2=j;

    }
    public int addition()
    {
        int ians=0;
        ians= this.ino1+ino2;
        return ians;
    }
    public int sub()
    {
        int ians=0;
        ians= this.ino1-ino2;
        return ians;
    }
    public int division(){
        int ians =0;
        ians =this.ino1/ino2;

        return ians ;
    }   
}

class Oopx{
    public static void main (String arg [])


    
    {
        Arithmatic aobj2= new Arithmatic(25,16);
        Arithmatic aobj1= new Arithmatic(12,6);
        int iret =0;
        iret =aobj1.addition();
        System.out.println("addition is :"+iret);
        iret =aobj1.sub();
        System.out.println("substraction is :"+iret);
        iret=aobj1.division();
        System.out.println("division is :"+iret); 
        iret=aobj2.addition();
        System.out.println("addition is :"+iret);
        System.out.println ("here thye integere no3 gives :"+Arithmatic.no3);

        Arithmatic.no3=6;
        System.out.println("here the static veriable is chnaged:"+aobj2.no3);

        }


}