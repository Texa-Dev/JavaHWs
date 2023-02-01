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
        System.out.println(s1);
        System.out.println(s2);


        while (s1.anyAlive()&&s2.anyAlive()){
            System.out.println("Step: " +step++);
            h1=s1.hero();
            h2=s2.hero();
            h2.takeDamage(h1.attack());
            System.out.printf("%s\t<--\t%s\n\n\n", h2,h1);
            System.out.println(h1.attack());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            h1.takeDamage(h2.attack());
            System.out.printf("%s\t-->\t%s\n\n\n", h2,h1);
            System.out.println(h2.attack());

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(s1.anyAlive()?"Squad 1 WIN":"Squad 2 WIN");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println("end");
    }
}
