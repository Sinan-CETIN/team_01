package week_01;

public class Door {
    public static void main(String[] args) {
        boolean[] lockers = new boolean[100];

        for (int students = 1; students <= 100; students++) {
            for (int doors = students - 1; doors < lockers.length; doors += students) {
                if(lockers[doors]) {
                    lockers[doors] = false;
                } else {
                    lockers[doors] = true;
                }
            }
        }

        for (int i = 0; i < lockers.length; i++) {
            if (lockers[i]) {
                System.out.print("L" + (i + 1) + " ");
            }
        }
    }
}
