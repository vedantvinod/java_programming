class Demo{
    public int i;
    public static int j;
    static{
        j=21;
    }
    public Demo(){
        this.i=11;//1st use
        System.out.println("inside default");

    }
    public Demo (int a){
        this();//second use
        System.out.println("inside parameterised");
    }
    public void display(){
        System.out.println("inside display"+this.i);//third use 

    }

}
 class ThisDemo {
    public static void main(String arr[]){
        Demo dobj=new Demo(51);
        dobj.display();

    }
}
