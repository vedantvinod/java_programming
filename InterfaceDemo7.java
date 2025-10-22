interface A{
    int no=11;//ambiguty 
    void fun();

}
interface B{
    int no=21;
    void fun();
}

class Demo implements A,B{
    public void fun(){
        System.out.println("inside fun"+A.no);
        

    }
   

}

class InterfaceDemo7 {
        public static void main (String arr[]){
            Demo dobj= new Demo();
            dobj.fun();
            
            

        }
}
