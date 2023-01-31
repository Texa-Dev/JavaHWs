package pack.structure.base;

import java.util.Random;

public class Hero {
    private String name;
    private int hp;
    private int attack;
    private boolean alive;
    private final Random random;

    {
        random = new Random();
        alive = true;
    }

    public Hero(String name, int hp, int attack) {
        this.name = name;
        setHp(hp);
        setAttack(attack);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp >= 0) {
            this.hp = hp;
            alive = hp > 0;
        }
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        if (attack >= 0)
            this.attack = attack;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    @Override
    public String toString() {

        return String.format(
                "name=%s,hp=%s, attack=%s, alive=%s",
                name, hp, attack, alive);
    }

    public int attack(){
        return random.nextInt(attack);
    }

    public void takeDamage(int attack){
        setHp(Math.max(hp - attack, 0));
    }
}
