package object_oriente_thinking;

public class Question_10_01 {
    public static void main(String[] args) throws InterruptedException {
        Time time = new Time();

        int[] array = new int[0];

        while(true) {
            long elapsedTime = System.currentTimeMillis();
            System.out.println(time.toString());
            time.setElapsedTime(elapsedTime);
            Thread.sleep(1000);
        }
    }
}
