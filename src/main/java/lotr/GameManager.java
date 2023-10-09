package lotr;

public class GameManager {
    public void fight(Character c1, Character c2) {
        System.out.println(c1 + " and " + c2 + " are fighting");
        while (c1.isAlive() && c2.isAlive()) {
                c1.kick(c2);
                c2.kick(c1);
            }
    
        if (c1.isAlive()) {
            System.out.println(c1 + " is the winner");
        } else {
            System.out.println(c2 + " is the winner");
        }
    }
}