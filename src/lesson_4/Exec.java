package lesson_4;


public class Exec {
    public static void main(String[] args){
        Bee bee1 = new Bee(15, "Red as Blood", new AttackImpl("Ride", "Slap"));
        Bee bee2 = new Bee(33, "Black", new AttackImpl("Run", "Hit"));
        Bee bee3 = new Bee(9, "White", new AttackImpl("Haunt", "Sting"));
        Bee bee4 = new Bee();
        bee1.attack();
        bee1.move();
        bee2.attack();
        bee2.move();
        bee3.attack();
        bee3.move();
        bee4.attack();
        bee4.move();

        //System.out.println(bee1.getColor());
    }
}
