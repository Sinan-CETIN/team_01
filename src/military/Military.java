package military;

public class Military {
    Human human;

    public Military(Human human) {
        this.human = human;
    }
    public void sendCelbKagidi() {
        System.out.println(this.getCelbKagidi());
    }

    public void askerligiTamamladi() throws InterruptedException {
        System.out.println("Suan askerde askerlik 10 saniye surecek!");
        for (int i = 10; i > 0; i--) {
            System.out.println("Askerligin " + i + " ayi ");

            Thread.sleep(500);

        }
        System.out.println("Holey askerlik bitti!");
        this.human.setAskerlikYaptimi(true);
    }

    public String getCelbKagidi() {
        return "Name -> " + this.human.getName() + "\n" +
                "Age ->" + this.human.getAge() + "\n" +
                "Askerlige gelin";
    }

}
