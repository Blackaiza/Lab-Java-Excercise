package LiftAssignmet;

public class Lift {
    
    private int load;
    private int speed;

    public Lift(int ld, int speed){
        load = ld;
        this.speed = load;
    }

    public int getLoad(){
        return load;
    }

    public int getSpeed(){
        return speed;
    }
}
