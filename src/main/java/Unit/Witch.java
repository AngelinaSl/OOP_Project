package Unit;

public class Witch extends Supernatural{

    public Witch(String name, Integer hp, Integer maxHp, Integer attack, Integer damage,
                 Integer protection, Integer speed, int mana, int maxMana) {
        super(name, hp, maxHp, attack, damage, protection, speed, mana, maxMana);
    }
    public Witch(String name) {
        super(name, 100, 100, 10, 30, 60, 90, 7, 5);

    }

    //    Магическая атака
    @Override
    public Integer getAttack() {
        return attack;
    }

}
