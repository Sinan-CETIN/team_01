package multi_dimensional_array;

import java.util.*;

public class Question_08_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] pointsArray = getPoints(4, input);
        double[] intersectionPoint = getIntersectionPoint(pointsArray);
        if (intersectionPoint != null) {
            System.out.printf("The intersection point is at (%.4f, %.4f)", intersectionPoint[0],
                    intersectionPoint[1]);
        } else {
            System.out.println("The two lines are parallel!");
        }
    }

    public static double[][] getPoints(int numberOfPoints, Scanner input) {
        double[][] result = new double[numberOfPoints][2];
        System.out.print("Enter points ");
        for (int i = 0; i < numberOfPoints; i++) {
            if (i == numberOfPoints - 1) {
                System.out.println("x" + (i + 1) + ", " + "y" + (i + 1) + " -> ");
            } else {
                System.out.print("x" + (i + 1) + ", " + "y" + (i + 1) + ", ");
            }
        }
        for (int i = 0; i < result.length; i++) {
            result[i][0] = input.nextDouble();// x noktasi
            result[i][1] = input.nextDouble();// y noktasi
            ; // y noktasi
        }
        return result;
    }

    public static double[] getIntersectionPoint(double[][] points) {
        double[] intersection = new double[2];

        // x1 - x2 = a   --> -ay

        // calculate intersection
        double a = points[0][1] - points[1][1];
        double b = points[1][0] - points[0][0];
        double e = a * points[0][0] - (-b * points[0][1]);
        double c = points[2][1] - points[3][1];
        double d = points[3][0] - points[2][0];
        double f = c * points[2][0] - (-d * points[2][1]);

        if (a * d - b * c == 0) {
            // bizim dogrularimiz kesismiyor
            return null;
        }
        intersection[0] = (e * d - b * f) / (a * d - b * c);
        intersection[1] = (a * f - e * c) / (a * d - b * c);

        return intersection;
    }
}
