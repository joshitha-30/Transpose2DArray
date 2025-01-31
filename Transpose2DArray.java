public class Transpose2DArray {
    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Original array:");
        printArray(array);

        int[][] transposedArray = transposeArray(array);

        System.out.println("Transposed array:");
        printArray(transposedArray);
    }

    public static int[][] transposeArray(int[][] array) {
        int rows = array.length;
        int columns = array[0].length;
        int[][] transposedArray = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposedArray[j][i] = array[i][j];
            }
        }

        return transposedArray;
    }

    public static void printArray(int[][] array) {
        int rows = array.length;
        int columns = array[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
} 