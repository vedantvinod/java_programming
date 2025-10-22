interface A{
    int no=11;
    void fun();

}
interface B{
    int no=21;
    void fun();
}

class Demo implements A,B{
    public void fun(){
        System.out.println("inside fun"+no);//no generates error
        

    }
   

}

class InterfaceDemo6 {
        public static void main (String arr[]){
            Demo dobj= new Demo();
            dobj.fun();
            
            

        }
}
