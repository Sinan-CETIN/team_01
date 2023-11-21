package object_oriente_thinking;

import java.util.Arrays;

public class MyString1 {
    private char[] chars;

    public MyString1(char[] chars) {
        this.chars = chars;
    }

    public int length() {
        return this.chars.length;
    }

    public MyString1 substring(int begin, int end) {
        char[] temp;
        if (begin >= 0 && begin < end && end < this.chars.length) {
            temp = new char[end - begin];
            int count = 0;
            for (int i = begin; i < end; i++) {
                temp[count++] = this.chars[i];
            }
        } else {
            throw new RuntimeException("Invalid index!");
        }
        return new MyString1(temp);
    }

    public MyString1 toLowerCase() {
        char[] result = new char[this.chars.length];
        for (int i = 0; i < this.chars.length; i++) {
            result[i] = Character.toLowerCase(this.chars[i]);
        }
        return new MyString1(result);
    }

    public char charAt(int index) {
        if (0 <= index && index < this.chars.length) {
            return this.chars[index];
        }
        throw new ArrayIndexOutOfBoundsException("index -> " + index + " out of the bound!");
    }

    public boolean equals(MyString1 str) {
        if (str.length() != this.length()) {
            return false;
        }
        for (int i = 0; i < this.length(); i++) {
            if (this.charAt(i) != str.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static MyString1 valueOf(int i) {
        String s = i + "";
        char[] result = new char[s.length()];
        for (int j = 0; j < result.length; j++) {
            result[i] = s.charAt(i);
        }
        return new MyString1(result);
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < this.chars.length; i++) {
            result.append(this.chars[i]);
        }
        return result.toString();
    }

}
