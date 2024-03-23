package LiftAssignmet;

public class Person {
    
    private String name;
    private int weight;

    public Person(String Name, int Weight){
        name = Name;
        weight = Weight;
    }

    public String getName(){
        return name;
    }

    public int getWeight(){
        return weight;
    }

    public String toString(){
        return (name + " " + weight);
    }
}
