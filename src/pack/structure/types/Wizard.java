package pack.structure.types;

import pack.structure.specialities.Mage;

public final class Wizard extends Mage {
    public Wizard(String name, int hpCf, int attackCf, int manaCf) {
        super(name,80*hpCf, 100*attackCf, 70*manaCf);
    }

    @Override
    public int attack() {
        if (getMana()>0&&getProbability().nextInt(10)==4){
            System.out.println("repair hp");
            setHp(getHp()+20);
            return super.attack();
        }
        return super.attack();
    }
}
