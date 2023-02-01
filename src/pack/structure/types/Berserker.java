package pack.structure.types;

import pack.structure.specialities.Warrior;

import java.util.Random;

public final class Berserker extends Warrior {

    public Berserker(String name, int hpCf, int attackCf, int armorCf) {
       super(name,150*hpCf, 80*attackCf, 50*armorCf);
    }

    @Override
    public int attack() {
        if (getProbability().nextInt(10)==2) {
            System.out.println("Critical");
            return (super.attack()+getAttack());
        }
        return super.attack();
    }


}
