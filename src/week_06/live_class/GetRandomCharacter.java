package week_06.live_class;

public class GetRandomCharacter {
    public static char getRandomCharacter(char ch1, char ch2) {
        return (char) (ch1 + (Math.random() * (ch2 - ch1 + 1)));
    }

    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }

    public static char getLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }


    public static char getRandomCharacterFromAsciiTable() {
        return getRandomCharacter('\u0000', '\uFFFF');
    }
}
