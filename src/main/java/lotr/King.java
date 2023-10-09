package lotr;


public class King extends Character{
    private static final java.util.Random randomHp = new java.util.Random();
    private static final java.util.Random randomPower = new java.util.Random();
    
    public King() {
        super(randomPower.nextInt(10) + 5, randomHp.nextInt(10) + 5);
        }
        
    @Override
    public void kick(Character c) {
        java.util.Random random = new java.util.Random();
        c.setHp(c.getHp() - random.nextInt(this.getPower()));
    }
}
