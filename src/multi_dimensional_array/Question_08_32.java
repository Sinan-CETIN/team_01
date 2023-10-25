package multi_dimensional_array;

import java.util.Scanner;

public class Question_08_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] points = Question_08_31.getPoints(3, input);
        double area = getTriangleArea(points);
        displayArea(area);
    }

    public static void displayArea(double area) {
        if(area == -1) {
            System.out.println("This is not a triangle");
        } else {
            System.out.println("The area of the triangle is ->" + area);
        }
    }

    public static double getTriangleArea(double[][] points) {

        double slope1 = calculateSlop(points, 0, 1);
        double slope2 = calculateSlop(points, 0, 1);
        double slope3 = calculateSlop(points, 0, 1);

        if (slope1 == slope2 || slope1 == slope3 || slope2 == slope3) {
            return -1;
        }

        // TODO dogrultu kontrol et
        double side1 = getDistance(points, 0, 1);
        double side2 = getDistance(points, 1, 2);
        double side3 = getDistance(points, 2, 0);

        double s = (side1 + side2 + side3) / 2;

        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public static double getDistance(double[][] points, int point1, int point2) {
        // Math.sqrt((x1 - x2)^2 + (y1 - y2)^2);
        return Math.sqrt(Math.pow(points[point1][0] - points[point2][0], 2) +
                Math.pow(points[point1][1] - points[point2][1], 2));
    }

    public static double calculateSlop(double[][] points, int point1, int point2) {
        // (y2 - y1) / (x2 - x1)
        return ((points[point2][1] - points[point1][1]) / (points[point2][0] - points[point1][0]));

    }
}
