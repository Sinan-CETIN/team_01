package military;

public class Human {

    public static final String MALE = "male";
    public static final String FEMALE = "female";
    private String name;
    private int age;
    private String gender;
    private boolean hasEducation;

    private boolean askerlikYaptimi;

    public Human(String name, int age, String gender, boolean hasEducation, boolean askerlikYaptimi) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hasEducation = hasEducation;
        this.askerlikYaptimi = askerlikYaptimi;
    }

    public boolean isNeedCelb() {
        boolean askerlikYaptimi = this.isAskerlikYaptimi();
        boolean hasEducation = this.isHasEducation();
        int age = this.getAge();

        if (!askerlikYaptimi &&
                !hasEducation &&
                (age >= 20 && age < 29)
                && this.getGender().equals(Human.MALE)) {
            return true;
        } else {
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isHasEducation() {
        return hasEducation;
    }

    public void setHasEducation(boolean hasEducation) {
        this.hasEducation = hasEducation;
    }

    public boolean isAskerlikYaptimi() {
        return askerlikYaptimi;
    }

    public void setAskerlikYaptimi(boolean askerlikYaptimi) {
        if(this.askerlikYaptimi) {
            return;
        }
        this.askerlikYaptimi = askerlikYaptimi;
    }
}
