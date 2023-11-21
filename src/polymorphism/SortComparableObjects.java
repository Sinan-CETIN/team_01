import polymorphism.Rectangle;

import java.math.*;

public class SortComparableObjects {
    public static void main(String[] args) {

        Rectangle[] rectangles = {new Rectangle(2, 3),
                new Rectangle(2, 5),
                new Rectangle(6, 3)};
        java.util.Arrays.sort(rectangles);
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle.toString());
        }
        String[] cities = {"Savannah", "Boston", "Atlanta", "Tampa"};
        java.util.Arrays.sort(cities);
        for (String city : cities)
            System.out.print(city + " ");
        System.out.println();
        BigInteger[] hugeNumbers = {new BigInteger("2323231092923992"),
                new BigInteger("432232323239292"),
                new BigInteger("54623239292")};
        java.util.Arrays.sort(hugeNumbers);
        for (BigInteger number : hugeNumbers)
            System.out.print(number + " ");
    }
}