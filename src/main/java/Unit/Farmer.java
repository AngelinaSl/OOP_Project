package Unit;

public class Farmer extends Human {
    public Farmer(String name, Integer hp, Integer maxHp, Integer attack, Integer damage, Integer protection, Integer speed) {
        super(name, hp, maxHp, attack, damage, protection, speed);
    }


    public Farmer(String name) {
        super(name, 100, 100, 10, 30, 60, 90);


    }

    //    Кормит
    public void treat(Human human){
    }
    //    Подносит патроны
    public void armiger (Shooter Shooter){

    }
}
