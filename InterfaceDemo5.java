interface A{
    void fun();

}
interface B{
    void fun();
}

class Demo implements A,B{
    public void fun(){
        System.out.println("inside fun");

    }
   

}

class InterfaceDemo5 {
        public static void main (String arr[]){
            Demo dobj= new Demo();
            dobj.fun();
            
            

        }
}
