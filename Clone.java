class Demo implements Cloneable {
    public int i;
    public int j;

   public Demo (int a, int b){
    this.i=a;
    this.j=b;

    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class Clone {

    public static void main(String arr[]){
        try{
        Demo dobj1=new Demo(11,21);
        Demo dobj2= (Demo)dobj1.clone();
        System.out.println(dobj2.i);
        System.out.println(dobj1.i);

        }
        catch(CloneNotSupportedException cobj){

        }

         
    }
}