package object_oriente_thinking;

public class Time {
    private int hour;
    private int minute;
    private int second;


    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSecond() {
        return this.second;
    }

    public Time() {
        this(System.currentTimeMillis());
    }

    public Time(long elapsedTime) {
        this.second = getCurrentSecond(elapsedTime);
        this.minute = getCurrentMinute(elapsedTime);
        this.hour = getCurrentHour(elapsedTime);
    }

    public void setElapsedTime(long elapsedTime) {
        this.second = getCurrentSecond(elapsedTime);
        this.minute = getCurrentMinute(elapsedTime);
        this.hour = getCurrentHour(elapsedTime);
    }

    private static int getCurrentSecond(long elapsedTime) {
        return (int) (getTotalSecond(elapsedTime) % 60);
    }

    private static long getTotalSecond(long elapsedTime) {
        return elapsedTime / 1000;
    }

    private static int getCurrentMinute(long elapsedTime) {
        return getTotalMinute(elapsedTime) % 60;
    }

    private static int getTotalMinute(long elapsedTime) {
        return (int) (getTotalSecond(elapsedTime) / 60);
    }

    private static int getCurrentHour(long elapsedTime) {
        return getTotalHour(elapsedTime) % 24;
    }

    private static int getTotalHour(long elapsedTime) {
        return getTotalMinute(elapsedTime) / 60;
    }

    public String toString() {
        return this.hour + ":" +
                (this.getMinute() < 10 ? "0" + this.minute : this.minute) + ":" +
                (this.second < 10 ? "0" + this.second : this.second);
    }
}
