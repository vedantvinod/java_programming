interface Demo{
    int no=11;
    

}
class Hello implements Demo{
        public void Display(){
            System.out.println("inside Display");
        }

}


class InterfaceDemo3 {
        public static void main (String arr[]){
            System.out.println(Demo.no);
            //Demo.no=12;//no is final
            Hello hobj = new Hello();
            hobj.Display();

        }
}
