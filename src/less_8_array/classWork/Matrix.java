package less_8_array.classWork;

/**
 * TheSusanin
 * 2/27/2021 Feb 2021
 */
public class Matrix {
    public static void main(String[] args) {
        int rows, cols;

        int a[][] = {
                {4, 5, 6},
                {3, 4, 1},
                {1, 2, 3}
        };
        int b[][] = {
                {2, 0, 3},
                {2, 3, 1},
                {1, 1, 1}
        };
        // вычисляем кол-во строк и столбцов в данной матрице
        rows = a.length;
        cols = a[0].length;

        int dirr[][] = new int[rows][cols];
        for (int i = 0; i < rows ; i++) {
            for (int j = 0; j < cols ; j++) {
                dirr[i][j] = a[i][j] - b[i][j];
            }
        }
        System.out.println("Вычитание двух матриц: ");
        for (int i = 0; i < rows ; i++) {
            for (int j = 0; j < cols ; j++) {
                System.out.print(dirr[i][j] + "");
            }
            System.out.println();
        }
    }
}
