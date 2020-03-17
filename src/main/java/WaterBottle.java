public class WaterBottle {
    private int volume;

    public WaterBottle(int volume){
        this.volume = volume;
    }

    public int checkWater(){
        return this.volume;
    }

    public int takeDrink(){
       return this.volume -= 10;
    }

    public int emptyDrink(){
        return this.volume  = 0;
    }

    public int fillDrink() {
      return this.volume = 100;
    }


}


