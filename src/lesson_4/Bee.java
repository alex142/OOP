package lesson_4;

public class Bee extends Insect implements Attack {
    private Attack attack;

    Bee(int size, String color, Attack attack){
        super(size, color);
        this.attack = attack;
    }
    Bee(){
        super(10, "Yellow");
        this.attack = new AttackImpl("Fly","Sting");
    }

    public void move(){
        attack.move();
    }
    public void attack(){
        attack.attack();
    }

}
