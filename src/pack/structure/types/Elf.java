package pack.structure.types;

import pack.structure.specialities.Archer;

public final class Elf extends Archer {
    public Elf(String name, int hpCf, int attackCf, int ammunitionCf) {
        super(name, 70*hpCf, 120*attackCf, 25*ammunitionCf);
    }
}
