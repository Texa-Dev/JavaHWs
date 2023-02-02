package pack.structure.types;

import pack.structure.specialities.Archer;

public final class Elf extends Archer {
    public Elf(String name, int hpCf, int attackCf, int ammunitionCf) {
        super(name, 70*hpCf, 120*attackCf, 25*ammunitionCf);
    }

    public int attack() {
        if (getAmmunition()>0&&getProbability().nextInt(10)==7){
            setAmmunition(getAmmunition()+1);
            System.out.print("Damage without ammunition ");
            return (int) (super.attack()*0.8);
        }
        return super.attack();
    }
}
