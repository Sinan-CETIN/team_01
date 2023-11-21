package points;

import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Triangle triangle = new Triangle(0, 0, 3, 0, 0, 4);


        System.out.println("Triangle perimeter -> " + triangle.getPerimeter());

        System.out.println(triangle.toString());
    }
}
