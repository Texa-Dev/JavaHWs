package pack.group;

import pack.structure.base.Hero;

public class Battlefield {
    private int size;
    private final Squad s1;
    private final Squad s2;
    private int step;

    public Battlefield(int size) {
        this.size = size;
        s1=new Squad(size);
        s2=new Squad(size);
        step=1;
    }

    public void fight(){
        Hero h1,h2;
        System.out.println("start");
        /*System.out.println(s1);
        System.out.println(s2);*/

        while (s1.anyAlive()&&s2.anyAlive()){
            System.out.println("Step: " +step++);
            h1=s1.hero();
            h2=s2.hero();
            System.out.print("Hero "+h1.getName()+" deals damage "+h2.getName()+" ");
            h2.takeDamage(h1.attack());
            System.out.println();
            System.out.printf("%s\t<--\t%s\n", h2,h1);

            if (!s2.anyAlive()) break;  //Цикл прерываеться если во втором отряде после хода не осталось живых героев
            if(!h2.isAlive()) h2=s2.hero(); // Проверка живой ли герой после хода, иначе походит атака от героя с 0hp

            System.out.print("Hero "+h1.getName()+" deals damage "+h2.getName()+" ");
            h1.takeDamage(h2.attack());
            System.out.println();
            System.out.printf("%s\t-->\t%s\n", h2,h1);

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(s1.anyAlive()?"Squad 1 WIN":"Squad 2 WIN");
        System.out.println("Squad 1: "+s1);
        System.out.println("Squad 2: "+s2);
        System.out.println("Game Over");
    }
}
