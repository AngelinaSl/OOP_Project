package Unit;
public abstract class Human implements GameInterface {

    protected String name;
    protected Integer hp;
    protected Integer maxHp;
    protected Integer attack;
    protected Integer damage;
    protected Integer protection;
    protected Integer speed;

    public Human(String name, Integer hp, Integer maxHp, Integer attack, Integer damage, Integer protection, Integer speed) {
        this.name = name;
        this.hp = hp;
        this.maxHp = maxHp;
        this.attack = attack;
        this.damage = damage;
        this.protection = protection;
        this.speed = speed;
    }
//    Атаковать
    public Integer getAttack() {
        return attack;
    }

//    Защищаться
    public Integer getProtection() {
        return protection;
    }

//    Нанести урон
    public Integer getDamage() {return damage;}

}
