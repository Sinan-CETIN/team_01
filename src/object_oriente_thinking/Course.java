package object_oriente_thinking;

import java.util.Arrays;

public class Course {
    private String courseName;
    private String[] students;
    private int numberOfStudents;

    public static final int INITIAL_STUDENTS_NUMBER = 10;

    public Course(String courseName) {
        this.courseName = courseName;
        students = new String[INITIAL_STUDENTS_NUMBER];
        numberOfStudents = 0;
    }

    public Course(String courseName, String[] students) {
        this.courseName = courseName;
        this.students = students;
        numberOfStudents = students.length;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public void addStudents(String name) {
        if (this.numberOfStudents >= this.students.length) {
            String[] temp = new String[this.students.length + 1];
            copyElement(this.students, temp);
            this.students = temp;
        }
        this.students[this.numberOfStudents++] = name;
    }

    public void dropStudents(String name) {
        if (contains(this.students, name)) {
            int index = getIndex(this.students, name);
            shiftStudentLeft(this.students, index);
            numberOfStudents--;
        } else {
            System.out.println(name + " is not in our Course!");
        }
    }

    private static void copyElement(String[] arr1, String[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
    }

    private static boolean contains(String[] arr, String key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(key)) {
                return true;
            }
        }
        return false;
    }

    private static int getIndex(String[] arr, String key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }

    private static void shiftStudentLeft(String[] arr, int index) {
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
    }

    public String[] getStudents() {
        String[] arr = new String[this.numberOfStudents];
        System.out.println(Arrays.toString(this.students));
        copy(this.students,arr);
        return arr;
    }

    private static void copy(String[] arr, String[] arr2) {
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr[i];
        }
    }

    public int getNumberOfStudents() {
        return this.numberOfStudents;
    }

    public String toString() {
        return "Course Name : " + this.courseName + "\n" +
                "Students -> " + displayStudents(this.students, this.numberOfStudents) + "\n" +
                "Number Of Students -> " + this.numberOfStudents;
    }


    private static String displayStudents(String[] arr, int index) {
        String result = "{";
        for (int i = 0; i < index; i++) {
            if (i == index - 1) {
                result += arr[i];
            } else {
                result += arr[i] + ", ";
            }
        }
        return result + "}";
    }
}

