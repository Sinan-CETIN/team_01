public class TestEdible {
    public static void main(String[] args) {

        System.out.println(new Integer(3).compareTo(new Integer(5)));
        System.out.println("ABC".compareTo("ABE"));
        java.util.Date date1 = new java.util.Date(2013, 1, 1);
        java.util.Date date2 = new java.util.Date(2012, 1, 1);
        System.out.println(date1.compareTo(date2));

//        Object[] objects = {new Tiger(), new Chicken(), new Apple()};
//        for (int i = 0; i < objects.length; i++) {
//            if (objects[i] instanceof Edible)
//                System.out.println(((Edible) objects[i]).howToEat());
//            if (objects[i] instanceof Animal) {
//                System.out.println(((Animal) objects[i]).sound());
//            }
//        }
    }
}



interface Edible {
    public abstract String howToEat();
}

abstract class Animal {
    /**
     * Return animal sound
     */
    public abstract String sound();
}

class Chicken extends Animal implements Edible {
    @Override
    public String howToEat() {
        return "Chicken: Fry it";
    }

    @Override
    public String sound() {
        return "Chicken: cock-a-doodle-doo";
    }
}

class Tiger extends Animal {
    @Override
    public String sound() {
        return "Tiger: RROOAARR";
    }
}

abstract class Fruit implements Edible {
// Data fields, constructors, and methods omitted here
}

class Apple extends Fruit {
    @Override
    public String howToEat() {
        return "Apple: Make apple cider";
    }
}

class Orange extends Fruit {
    @Override
    public String howToEat() {
        return "Orange: Make orange juice";
    }
}