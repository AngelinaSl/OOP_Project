package Unit;
public class Spearman extends Warrior {


    public Spearman(String name, Integer hp, Integer maxHp, Integer attack, Integer damage, Integer protection, Integer speed) {
        super(name, hp, maxHp, attack, damage, protection, speed);
    }

    public Spearman(String name) {
        super(name, 100, 100, 10, 30, 60, 90);


    }

    //    убегает с поля (не функционирует 1-2 хода при критическом HP)
    public void runAway() {
    }
}
