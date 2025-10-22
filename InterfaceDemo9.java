interface A{
    int no=11;
    void fun();
    default void gun(){
        System.out.println("inside gun");
        Display();
    }


    private void Display(){

        System.out.println("inside private display");
        

    }    
    

}
class Demo implements A{
    public void fun(){
        System.out.println("inside fun");
    } 
}
class InterfaceDemo9 {
        public static void main (String arr[]){
            Demo dobj= new Demo();
            dobj.fun();
            dobj.gun();
        

            
            

        }
}
