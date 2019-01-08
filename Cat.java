public class Cat extends Animal {
    private double jump_h=2;
    private double  swim_d=0;
    private double run_d=200;
    boolean isFull=false;
    int appetite;
    miska Miska;
    Cat(Integer ... argc){
        if(argc[0]!=null)jump_h=argc[0];
        if(argc[1]!=null)swim_d=argc[1];
        if(argc[2]!=null)run_d=argc[2];
        if(argc[3]!=null)appetite=argc[3];
    }
    Cat(int _appetite,miska _miska){
        appetite=_appetite;
        Miska=_miska;
    }
    @Override
    public void swim(double a) {
        System.out.print("Кошка не умеет плавать \n");
    }

    @Override
    public void jump(double a) {
        boolean y=a<=jump_h;
        System.out.println("Результат jump:"+y);
    }

    @Override
    public void run(double a) {
        boolean y=a<=run_d;
        System.out.println("Результат run:"+y);
    }
    @Override public void eat(){
        if(Miska.getFood(appetite))isFull=true;
        System.out.println("Кошка сыта:"+isFull);
    }
}
