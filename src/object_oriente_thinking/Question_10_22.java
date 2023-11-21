package object_oriente_thinking;

public class Question_10_22 {
    public static void main(String[] args) {
        MyString1 str = new MyString1(new char[]{'S', 'i', 'n', 'a', 'n'});
        MyString1 str1 = new MyString1(new char[]{'s', 'i', 'n', 'a', 'n'});

        System.out.println("equals -> " + str.equals(str1));
        System.out.println("charAt 4 -> " + str.charAt(4));
        System.out.println("substring 0 4  -> " + str.substring(0, 4));
        System.out.println("before lower case -> " + str);
        System.out.println("toLowerCase -> " + str.toLowerCase());
    }
}
