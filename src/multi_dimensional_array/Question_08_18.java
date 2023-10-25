package multi_dimensional_array;

public class Question_08_18 {
    public static void main(String[] args) {
        int[][] array = createArray(10);
        display(array);
        shuffle(array);
        display(array);
    }

    public static int[][] createArray(int row) {
        int[][] result = new int[row][2];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = (int)(Math.random() * 10);
            }
        }
        return result;
    }

    public static void display(int[][] array) {
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print("{" + array[i][0] + ", " + array[i][1]+ "}");
            if(i == array.length - 1) {
                System.out.println("}");
            }else {
                System.out.print(", ");
            }
        }
    }

    public static void shuffle(int[][] array){
        for (int i = 0; i < array.length; i++) {
            int index = (int)(Math.random()* array.length);
            swapRow(array,i,index);
        }
    }

    public static void swapRow(int[][] array, int firstRow, int secondRow) {
        int[] temp = array[firstRow];
        array[firstRow] = array[secondRow];
        array[secondRow] = temp;
    }
}
