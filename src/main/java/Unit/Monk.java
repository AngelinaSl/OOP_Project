package Unit;

public class Monk extends Supernatural {

    int FreezeStep;
    public Monk(String name, Integer hp, Integer maxHp, Integer attack, Integer damage,
                Integer protection, Integer speed, int mana, int maxMana) {
        super(name, hp, maxHp, attack, damage, protection, speed, mana, maxMana);
        this.FreezeStep = FreezeStep;
    }



    public Monk(String name) {
        super(name, 100, 100, 10, 30, 60, 90, 8, 9 );
        this.FreezeStep = 7;


    }

    //замораживает ходы колдуна на несколько ходов
    public Integer FreezeWitch(Witch witch){
        return FreezeStep;
    }



}
