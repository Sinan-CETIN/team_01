package multi_dimensional_array;

import java.util.Scanner;

public class Question_08_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] points = Question_08_31.getPoints(4, input);
        double[] intersectionPoint = Question_08_31.getIntersectionPoint(points);
        double[] areasArray = getAreasOfTriangle(points, intersectionPoint);
        sort(areasArray);
        displayAreas(areasArray);
    }

    public static double[] getAreasOfTriangle(double[][] points, double[] intersection) {
        double[] result = new double[4];

        result[0] = getAreasOfTriangleArea(points, 0, 2, intersection);
        result[1] = getAreasOfTriangleArea(points, 1, 2, intersection);
        result[2] = getAreasOfTriangleArea(points, 1, 3, intersection);
        result[3] = getAreasOfTriangleArea(points, 3, 0, intersection);

        return result;
    }

    public static double getAreasOfTriangleArea(double[][] points, int point1,
                                                int point2, double[] intersection) {
        double side1 = getDistance(points[point1], points[point2]);
        double side2 = getDistance(points[point1], intersection);
        double side3 = getDistance(points[point2], intersection);

        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public static double getDistance(double[] point1, double[] point2) {
        return Math.sqrt(Math.pow(point1[0] - point2[0], 2)
                + Math.pow(point1[1] - point2[1], 2));
    }

    public static void sort(double[] areas) {
        for (int i = 0; i < areas.length - 1; i++) {
            double min = areas[i];
            int minIndex = i;
            for (int j = i + 1; j < areas.length; j++) {
                if (min > areas[j]) {
                    min = areas[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                double temp = areas[i];
                areas[i] = areas[minIndex];
                areas[minIndex] = temp;
            }
        }
    }

    public static void displayAreas(double[] areas) {
        System.out.print("The areas are ");
        for (int i = 0; i < areas.length; i++) {
            System.out.printf("%.2f ",areas[i]);
        }
        System.out.println();
    }
}
