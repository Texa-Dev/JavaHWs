package pack.structure.specialities;

import pack.structure.base.Hero;

public abstract class Mage extends Hero {
    private int mana;

    public Mage(String name, int hp, int attack, int mana) {
        super(name, hp, attack);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public int attack() {
        if (mana > 0) {
            mana -= 10;
            return (int) (super.attack() * 1.2);
        }
        return 0;
    }

    @Override
    public String toString() {
        return String.format("%s, mana=%s",
                super.toString(), mana);
    }
}
