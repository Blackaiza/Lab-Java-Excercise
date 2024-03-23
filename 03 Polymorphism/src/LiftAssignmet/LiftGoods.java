package LiftAssignmet;


public class LiftGoods extends Lift{
    
    private int numOfEachItem;
    private Goods ginLift;
    private Person pinLift;
    private int totalWeight = 0;

    public LiftGoods(int load, int speed){
        super(load, speed);
    }

    public void setPersoninLift(Person a){
        pinLift = a;
        totalWeight += pinLift.getWeight();
        System.out.println(a.toString() + "kg in the lift.");
    }

    public void setNumberEachOfBox(int numberEachBox){
        numOfEachItem = numberEachBox;
    }

    public void setGoodsinLift(Goods b){
        ginLift = b;
        if((totalWeight + (ginLift.getWeight() * numOfEachItem)) > super.getLoad()){
            System.out.println("Sorry, overloaded. Need to reduce number of boxes or try insert next lift!");
        }
        else{
            totalWeight += (ginLift.getWeight() * numOfEachItem);
            System.out.println(ginLift.toString() + "kg each box with " + numOfEachItem + " box/es can insert into lift.");
        }
    }
}
