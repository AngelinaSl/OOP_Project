import Unit.*;

import java.util.Random;

public class main {
    public static void main(String[] args) {

        Bandit pers1 = new Bandit(getName());

        Crossbowman pers2 = new Crossbowman(getName());

        Farmer pers3 = new Farmer(getName());

        Monk pers4 = new Monk(getName());

        Sniper pers5 = new Sniper(getName());

        Spearman pers6 = new Spearman(getName());

        Witch pers7 = new Witch(getName());

    }
    public static String getName(){
        String name = String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
        return name;
    }
}
