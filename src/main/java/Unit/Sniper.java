package Unit;

public class Sniper extends Shooter{
    public Sniper(String name, Integer hp, Integer maxHp, Integer attack, Integer damage, Integer protection, Integer speed, int cartridges, int range) {
        super(name, hp, maxHp, attack, damage, protection, speed, cartridges, range);
    }

    public Sniper(String name) {
        super(name, 150, 150, 10, 10, 5, 3, 8, 9);
    }

    //    Атака дальнего боя с возможностью ранить 2х игроков
    @Override
    public Integer getAttack() {
        return attack;
    }
}
