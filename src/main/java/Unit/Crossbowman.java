package Unit;

public class Crossbowman  extends Shooter {

    public Crossbowman(String name, Integer hp, Integer maxHp, Integer attack, Integer damage, Integer protection, Integer speed, Integer cartridges, Integer range) {
        super(name, hp, maxHp, attack, damage, protection, speed, cartridges, range);
    }
        public Crossbowman(String name) {
        super(name, 150, 150, 10, 10, 5, 3,6, 4);
    }

    //    Атака дальнего боя (-HP и шанс заблокировать атаку противника на 1 ход)
    @Override
    public Integer getAttack() {
        return attack;
    }
}


