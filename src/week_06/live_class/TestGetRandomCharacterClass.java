package week_06.live_class;

public class TestGetRandomCharacterClass {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(GetRandomCharacter.getLowerCaseLetter() + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print(GetRandomCharacter.getRandomUpperCaseLetter() + " ");
        }
        System.out.println();

        for (int i = 0; i < 10 ; i++) {
            System.out.print(GetRandomCharacter.getRandomCharacter('0', '9') + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print(GetRandomCharacter.getRandomCharacterFromAsciiTable() + " ");
        }
    }
}
