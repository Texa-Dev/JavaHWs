package pack.structure.specialities;

import pack.structure.base.Hero;

public abstract class Archer extends Hero {
    private int ammunition;

    public Archer(String name, int hp, int attack, int ammunition) {
        super(name, hp, attack);
        this.ammunition = ammunition;
    }

    public int getAmmunition() {
        return ammunition;
    }

    public void setAmmunition(int ammunition) {
        this.ammunition = ammunition;
    }

    @Override
    public int attack() {
        if (ammunition>0) {
            setAmmunition(ammunition--);
            return super.attack();
        }
        return 0;
    }

    @Override
    public String toString() {
        return String.format("%s, ammunition=%s",
                super.toString(), ammunition);
    }
}
