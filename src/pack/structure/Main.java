package pack.structure;

import pack.structure.base.Hero;
import pack.structure.specialities.Archer;
import pack.structure.types.Hunter;

public class Main {
    public static void main(String[] args) {
        Hunter first = new Hunter("Arch", 2, 1, 2) ;

        System.out.println(first);

        for (int i = 0; i < 50; i++) {
            System.out.println(first.attack());
        }

        System.out.println(first);
    }
}
