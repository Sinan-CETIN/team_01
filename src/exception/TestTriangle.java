package exception;

public class TestTriangle {
    public static void main(String[] args) {

        try {
            Triangle triangle = new Triangle(2, 2, 2);

        } catch (IllegalTriangleException ex) {
            ex.printStackTrace();
        }


    }
}

