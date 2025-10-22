interface A{
    int no=11;
    void fun();
    default void gun(){
        System.out.println("inside gun");
    }

}
class Demo implements A{
    public void fun(){
        System.out.println("inside fun");
    } 
}
class InterfaceDemo8 {
        public static void main (String arr[]){
            Demo dobj= new Demo();
            dobj.fun();
            dobj.gun();
            
            

        }
}
