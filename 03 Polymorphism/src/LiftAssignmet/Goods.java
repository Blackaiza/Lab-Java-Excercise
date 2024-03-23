package LiftAssignmet;

public class Goods {
    
    private String name;
    private int weight;

    public Goods(String name, int weight){
        this.name = name;
        this.weight = weight;
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
