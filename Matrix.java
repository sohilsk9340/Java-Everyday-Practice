
public class Matrix {
    private int rows;
    private int columns;
    private int[][] data;

    // Constructor to initialize the dimensions of the matrix
    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.data = new int[rows][columns];
    }

    // Method to fill the matrix with values
    public void fillMatrix(int[][] values) {
        if (values.length != rows || values[0].length != columns) {
            System.out.println("Error: Dimensions of input values do not match matrix dimensions.");
            return;
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                data[i][j] = values[i][j];
            }
        }
    }

    // Method to print the matrix
    public void printMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Example usage
        int[][] values = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        Matrix matrix = new Matrix(3, 3);
        matrix.fillMatrix(values);
        matrix.printMatrix();
    }
}



