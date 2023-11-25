package abstract_classes;

import polymorphism.Circle;
import polymorphism.GeometricObject;
import polymorphism.Rectangle;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {

        ArrayList<GeometricObject> objects = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            int type = getType();

            switch (type) {
                case 1:
                    double radius = getRandom();
                    objects.add(new Circle(radius));
                    break;
                case 2:
                    double height = getRandom() ;
                    double width = getRandom() ;
                    objects.add(new Rectangle(width, height));
            }
        }

        Collections.sort(objects);
        displayObjects(objects);
    }

    private static void displayObjects(ArrayList<GeometricObject> objects) {
        for (GeometricObject o :
                objects) {
            System.out.println(o);
        }
    }

    private static int getType() {
        return (int) (Math.random() * 2) + 1;
    }

    private static double getRandom() {
        return Math.random() * 10;
    }
}
