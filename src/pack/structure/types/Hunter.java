package pack.structure.types;

import pack.structure.specialities.Archer;

public final class Hunter extends Archer {
    public Hunter(String name, int hpCf, int attackCf, int ammunitionCf) {
        super(name, 50 * hpCf, 150 * attackCf, 20 * ammunitionCf);
    }

    @Override
    public int attack() {
        if (getProbability().nextInt(0, 10) == 8) {
            setHp(getHp() - 20);
            return (int) (super.attack() * 1.5);
        }
        return super.attack();
    }
}
