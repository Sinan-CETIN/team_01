import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class SampleTest {
    public static void main(String[] args) {
        int[] list1 = {1, 2};
        int[] list2 = list1.clone();
        list1[0] = 7;
        list2[1] = 8;
        System.out.println("list1 is " + list1[0] + ", " + list1[1]);
        System.out.println("list2 is " + list2[0] + ", " + list2[1]);
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter string 1 : ");
//        String s1 = input.nextLine();
//        System.out.print("Enter string 2 : ");
//        String s2 = input.nextLine();
//
//        int number = (s1.length() < s2.length()) ? s1.length() : s2.length();
//
//        int longestPrefixIndex = -1;
//        for (int i = 0; i < number; i++) {
//            if (s1.charAt(i) != s2.charAt(i)) {
//                break;
//            }else {
//                longestPrefixIndex = i;
//            }
//        }
//        if (longestPrefixIndex == -1) {
//            System.out.println(s1 + " and " + s2 + " have no common prefix.");
//        } else {
//            System.out.println("The common prefix is " + s1.substring(0, longestPrefixIndex + 1));
//        }
    }
}
