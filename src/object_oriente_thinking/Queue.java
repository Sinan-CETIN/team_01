package object_oriente_thinking;

import java.util.Arrays;

public class Queue {
    private int[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 8;

    public Queue() {
        //this(DEFAULT_CAPACITY);
        this.elements = new int[DEFAULT_CAPACITY];
    }

    public Queue(int length) {
        this.elements = new int[length];
    }

    public void enqueue(int number) {
        if (size >= this.elements.length) {
            System.out.println("Double the capacity!");
            int[] temp = new int[this.elements.length * 2 + 1];
//            copy(this.elements, temp);
            System.arraycopy(this.elements, 0, temp, 0, this.elements.length);
            this.elements = temp;
        }

        this.elements[size++] = number;
    }


    public int dequeue() {
        if (this.isEmpty()) {
            System.out.println("Queue is empty now!");
            System.exit(1);
        }
        int result = this.elements[0];
        shiftELementToLeft(this.elements);
        size--;
        return result;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return this.size;
    }

    public static void shiftELementToLeft(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
    }
}
