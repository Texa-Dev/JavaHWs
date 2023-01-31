package pack.structure.specialities;

import pack.structure.base.Hero;

public abstract class  Warrior extends Hero {
    private int armor;



    public Warrior(String name, int hp, int attack, int armor) {
        super(name, hp, attack);
        setArmor(armor);
    }

    public int getArmor() {
        return armor;
    }
    public void setArmor(int armor) {
        if (armor>=0)
            this.armor = armor;
    }

    @Override
    public String toString() {
        return String.format("%s, armor=%s",
                super.toString(), armor);
    }

    @Override
    public void takeDamage(int attack) {
        super.takeDamage(Math.max(attack-armor, 0));
        armor--;
    }
}
