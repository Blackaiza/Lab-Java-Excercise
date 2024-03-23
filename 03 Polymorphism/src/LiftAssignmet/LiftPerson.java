package LiftAssignmet;


public class LiftPerson extends Lift{
    
    private int maxPerson;
    private Person pinLift;
    private int total = 0;
    private int per = 0;

    public LiftPerson(int ld, int speed, int maxPerson){
        super(ld, speed);
        this.maxPerson = maxPerson;
    }

    public void setPersoninLift(Person person){
        
        per++;
        if(total + person.getWeight() <= super.getLoad()){
            if(per <= maxPerson){
                pinLift = person;
                System.out.println(pinLift.toString() + "kg is in the lift");
                total += pinLift.getWeight();
            }
            else{
                System.out.println(person.toString() + "kg cannot enter the lift because over limit person");
                per--;
            }
        }
        else {
            System.out.println(person.toString() + "kg cannot enter the lift because overload");
            per--;
        }
    }

}
