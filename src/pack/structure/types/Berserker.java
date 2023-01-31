package pack.structure.types;

import pack.structure.specialities.Warrior;

import java.util.Random;

public final class Berserker extends Warrior {

    public Berserker(String name, int hpCf, int attackCf, int armorCf) {
       super(name,150*hpCf, 80*attackCf, 50*armorCf);
    }

    @Override
    public int attack() {
        if (getProbability().nextInt(0,10)==2) {
            return (int) (super.attack()*1.2);
        }
        return super.attack();
    }


}
