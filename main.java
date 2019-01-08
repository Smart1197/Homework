public class main {
   static Animal [] cat = new Animal[5];
    public static void main(String argc[]){
         miska Miska=new miska(30);
        cat[0]= new Cat(5,Miska);
        cat[1]= new Cat(10,Miska);
        cat[2]= new Cat(15,Miska);
        cat[3]= new Cat(20,Miska);
        cat[4]= new Cat(40,Miska);
        for(Animal cat_:cat)cat_.eat();
    }

}
