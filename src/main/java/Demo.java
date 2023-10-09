import lotr.CharacterFactory;
import lotr.GameManager;
import lotr.Character;
import lotr.Elf;
import lotr.Hobbit;
import lotr.King;
import lotr.Knight;



public class Demo {
    public static void main(String[] args) {
        CharacterFactory characterFactory = new CharacterFactory();
        GameManager gameManager = new GameManager();
        Character c1 = characterFactory.createCharacter();
        Character c2 = characterFactory.createCharacter();
        gameManager.fight(c1, c2);
    }
}
