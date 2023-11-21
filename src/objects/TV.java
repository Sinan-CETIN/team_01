package objects;

public class TV {
    public static void main(String[] args) {

        System.out.println("Lets Start Tv!");

        TV tv1 = new TV();
        System.out.println(tv1.toString());

        System.out.println(TV.numberOfTv);
        try {
            System.out.println(tv1.getChannel());
        } catch (RuntimeException ex) {
            System.out.println("To learn channel value Open your tv first!");
        }
        tv1.turnOn();
        System.out.println("Channel -> " + tv1.getChannel());


        System.out.println("Volume ->" + tv1.getVolume());
        while (!tv1.isVolumeFull()) {
            tv1.volumeUp();
        }
        System.out.println("Volume ->" + tv1.getVolume());
    }

    static int numberOfTv = 0;
    int channel;
    int volume;
    boolean isTurnOn;

    public TV() {
        this.channel = 1;
        this.volume = 10;
        this.isTurnOn = false;
        numberOfTv++;
    }

    public void turnOf() {
        this.isTurnOn = false;
    }

    public void turnOn() {
        this.isTurnOn = true;
    }

    public boolean isTvOpen() {
        return this.isTurnOn;
    }

    public void volumeUp() {
        if (isTvOpen() && this.volume < 100) {
            this.volume++;
        }
    }

    public void volumeDown() {
        if (this.isTvOpen() && this.volume > 0) {
            this.volume--;
        }
    }

    public void channelDown() {
        if (this.isTvOpen() && this.channel > 0) {
            this.channel--;
        }
    }

    public void channelUp() {
        if (this.isTvOpen() && this.channel < 50) {
            this.channel++;
        }
    }

    public int getChannel() {
        if (this.isTvOpen()) {
            return this.channel;
        } else {
            throw new RuntimeException("Open your TV!");
        }
    }

    public int getVolume() {
        if (this.isTvOpen()) {
            return this.volume;
        } else {
            return -1;
        }
    }

    public boolean isVolumeFull() {
        return this.getVolume() == 100;
    }

    public String toString() {
        if (this.isTvOpen()) {
            return "Volume -> " + this.getVolume() + "/n" +
                    "Channel -> " + this.getChannel() + "/n";
        } else {
            return "Tv is not open!";
        }

    }
}