public class mengecekmatrikidentitasjava {
    public static void main(String[] args) {
        // Contoh matriks input
        int[][] matriks = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };

        // Cek apakah matriks adalah identitas
        if (isIdentitas(matriks)) {
            System.out.println("Matriks adalah matriks identitas.");
        } else {
            System.out.println("Matriks BUKAN matriks identitas.");
        }
    }

    // Method untuk mengecek matriks identitas
    public static boolean isIdentitas(int[][] m) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j && m[i][j] != 1) {
                    return false;
                } else if (i != j && m[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }
}

