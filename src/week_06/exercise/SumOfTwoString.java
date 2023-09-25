package week_06.exercise;

public class SumOfTwoString {
    public static void main(String[] args) {
        String s1 = "12132.001";
        String s2 = "8.5";

        StringBuilder s1Part1 = new StringBuilder();
        StringBuilder s1Part2 = new StringBuilder();
        StringBuilder s2Part1 = new StringBuilder();
        StringBuilder s2Part2 = new StringBuilder();

        if (s1.contains(".")) {
            s1Part1 = new StringBuilder(s1.substring(0, s1.indexOf(".")));
            s1Part2 = new StringBuilder(s1.substring(s1.indexOf(".") + 1));
        }
        if (s2.contains(".")) {
            s2Part1 = new StringBuilder(s2.substring(0, s2.indexOf(".")));
            s2Part2 = new StringBuilder(s2.substring(s2.indexOf(".") + 1));
        }
        if (s1Part1.length() != s2Part1.length()) {
            putZerosPart1(Math.abs(s1Part1.length() - s2Part1.length()), s1Part1.length() > s2Part1.length() ? s2Part1 : s1Part1);
        }

        if(s1Part2.length() != s2Part2.length()) {
            putZerosPart2(Math.abs(s1Part2.length() - s2Part2.length()), s1Part2.length() > s2Part2.length() ? s2Part2 : s1Part2);
        }
        System.out.println(s1Part1 + "." + s1Part2);
        System.out.println(s2Part1 + "." + s2Part2);
    }

    public static void putZerosPart1(int length , StringBuilder s1) {
        for (int i = 0; i < length; i++) {
            s1.insert(0,'0');
        }
    }

    public static void putZerosPart2(int length, StringBuilder s) {
        for (int i = 0; i < length; i++) {
            s.insert(s.length(), "0");
        }
    }

}
