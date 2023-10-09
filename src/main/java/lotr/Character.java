package lotr;

public class Character {
    private int power;
    private int hp;

    public Character(int power, int hp) {
        this.power = power;
        this.hp = hp;
    }

    public void kick(Character c) {
        c.setHp(c.getHp() - this.getPower());
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public int getPower() {
        return power;
    }

    public int getHp() {
        return hp;
    }

    public String toString() {
        return this.getClass().getSimpleName() + "{hp=" + hp + ", power=" + power + "}";
    }

    public void setHp(int hp) {
        this.hp = hp < 0 ? 0 : hp;
    }
}
