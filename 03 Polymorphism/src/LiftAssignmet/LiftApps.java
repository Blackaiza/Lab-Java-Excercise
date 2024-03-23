package LiftAssignmet;

import java.util.*;

public class LiftApps {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //Create object for LiftPerson and LiftGoods
        LiftPerson liftA = new LiftPerson(200, 30, 7);
        LiftGoods liftB = new LiftGoods(1050, 30);

        //Choose Type either "LiftA" or "LiftB"
        String type = sc.nextLine();

        //Choose LiftA
        if(type.equals("LiftA")){

            //Enter total person want to enter the lift
            int totalPerson = sc.nextInt();

            //Create object for Person
            Person[] person = new Person[totalPerson];

            //Insert data of every person
            for (int i = 0; i < person.length; i++) {
                String name = sc.next();
                int weight = sc.nextInt();
                person[i] = new Person(name, weight);

                //Set person into PersonLift
                liftA.setPersoninLift(person[i]);
            }
        }
        //Choose LiftB
        else if(type.equals("LiftB")){

            //Assumption only 2 staff enter the lift
            Person[] staff = new Person[2];

            int totalBox = sc.nextInt();
            Goods[] goods = new Goods[totalBox];

            //Insert data for 2 Staff
            for (int i = 0; i < staff.length; i++) {
                String Name = sc.next();
                int Weight = sc.nextInt();
                staff[i] = new Person(Name, Weight);
                liftB.setPersoninLift(staff[i]);
            }

            //Insert boxes into this GoodLift
            for(int i = totalBox - 1; i > 0; i--){
                String brand = sc.next();
                int weightbox = sc.nextInt();

                //Assume the same product with many boxes
                int numeachbox = sc.nextInt();

                goods[i] = new Goods(brand, weightbox);
                liftB.setNumberEachOfBox(numeachbox);
                liftB.setGoodsinLift(goods[i]);

                //Reduce the number of boxes
                i -= numeachbox;
            }
        }
        else{
            System.out.println("Wrong Input");
        }
        sc.close();
    }
}
