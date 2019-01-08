public  class miska {
    private int max_food_v;
    private int curent_food;
    miska(int _max_food_v){
    max_food_v=_max_food_v;
    curent_food=_max_food_v;
}


   public boolean getFood(int appetite){
        boolean result=false;
       if(curent_food==0){System.out.print("Еда закончилась \n"+"Производим наполнение миски \n");curent_food=max_food_v;}
       if (curent_food-appetite>=0){result= true;curent_food-=appetite;}
       return result;
    }
    public int getCurent_food(){return curent_food;}
}
