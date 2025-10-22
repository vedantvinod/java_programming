class Demo{
        public int ino1;
        public int ino2;

        public Demo(){

            System.out.println("inside default construcytor");

        }
        public Demo (int i,int j){

            System.out.println("inside parameterized constructor");
        }
        public Demo (int i,int j,int k){

            System.out.println("inside parameterized constructor with 3 parame");
        }
}




class Constructor{
        public static void main (String arg []){
            Demo obj1= new Demo();
            Demo dobj2 = new Demo(11,21);
            Demo dobj3= new Demo (1,2,3);


        }


}