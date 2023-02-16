package Unit;

public class Bandit extends Warrior {
    int disguise;

    public Bandit(String name, Integer hp, Integer maxHp, Integer attack, Integer damage, Integer protection, Integer speed, int disguise) {
        super(name, hp, maxHp, attack, damage, protection, speed);
        this.disguise = disguise;
    }
    public Bandit(String name) {
        super(name, 100, 100, 10, 30, 60, 90);
        this.disguise = 50;

    }

//    Своровать
    public void steal(int disguise, Shooter Shooter) {

    }

}
