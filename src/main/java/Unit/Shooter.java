package Unit;

public abstract class Shooter extends Human {
    Integer range;
    Integer cartridges;



    public Shooter(String name, Integer hp, Integer maxHp, Integer attack, Integer damage, Integer protection, Integer speed, Integer cartridges, Integer range) {
        super(name, hp, maxHp, attack, damage, protection, speed);
    }

//    Одним выстрелом - headshot и смерть противника (шанс)
    public void kill (Warrior Warrior){
    }
//    Пользоваться патронами/стрелами
    public int getCartridges() {
        return this.cartridges;
    }
    public void setCartridges(Integer cartridges) {this.cartridges = cartridges;}



}
