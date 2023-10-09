package lotr;
import java.util.Random;

public class Knight extends Character{
    private static final Random randomHp = new Random();
    private static final Random randomPower = new Random();
    
    public Knight() {
        super(randomPower.nextInt(10) + 2, randomHp.nextInt(10) + 2);
    }

    @Override
    public void kick(Character c) {
        java.util.Random random = new java.util.Random();
        c.setHp(c.getHp() - random.nextInt(this.getPower()));
    }
    
}
