public class transposisimatriksjava {
    public static void main(String[] args) {
        // Matriks 3x3 awal
        int[][] matriks = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Matriks asli:");
        printMatrix(matriks);

        // Lakukan transposisi
        int[][] transposed = transposeMatrix(matriks);

        System.out.println("Matriks setelah transposisi:");
        printMatrix(transposed);
    }

    // Method untuk melakukan transposisi
    public static int[][] transposeMatrix(int[][] m) {
        int[][] result = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[j][i] = m[i][j];
            }
        }

        return result;
    }

    // Method untuk mencetak matriks
    public static void printMatrix(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println("]");
        }
    }
}
