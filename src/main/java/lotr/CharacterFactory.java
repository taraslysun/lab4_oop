package lotr;

public class CharacterFactory{
    public Character createCharacter() {
        int random = (int) (Math.random() * 3);
        switch (random) {
            case 0:
                return new Elf();
            case 1:
                return new Hobbit();
            case 2:
                return new King();
            case 3:
                return new Knight();
            default:
                return null;
        }
    }
}