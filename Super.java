class Hello {
    public int i;
    public Hello(int no){
        System.out.println("inside hello constructor");
        this.i=no+1;
    }
}

class Demo extends Hello{
    public int i;
    public Demo(int a){
        super(a);
        this.i=a;//1st use
        System.out.println("inside parameterised ");
    }
    public Demo(){
        super(0);
        System.out.println("inside default constructor ");
    }

    

    public void display(){
        System.out.println("inside display"+i);
        System.out.println("inside display"+this.i);
        System.out.println("inside display"+super.i);
         

    }

}
 class Super {
    public static void main(String arr[]){
        Demo dobj= new Demo(21);
        dobj.display();
    }
}
