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
        protected void finalize (){
            System.out.println("inside finalize");
        }
}

class Constructordes{
        public static void main (String arg []){
            Demo dobj1= new Demo();
            Demo dobj2 = new Demo(11,21);
            System.gc();
            dobj1=null;
            dobj2=null;

            System.out.println("main is done");


        }


}