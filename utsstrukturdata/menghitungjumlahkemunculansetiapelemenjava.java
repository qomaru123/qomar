public class menghitungjumlahkemunculansetiapelemenjava {
    public static void main(String[] args) {
        // Inisialisasi array secara langsung
        int[] array = {1, 2, 1, 3, 4, 2, 1};

        // Hitung dan cetak jumlah kemunculan setiap elemen
        countOccurrences(array);
    }

    // Method untuk menghitung jumlah kemunculan
    public static void countOccurrences(int[] arr) {
        boolean[] counted = new boolean[arr.length]; // Menandai elemen yang sudah dihitung

        for (int i = 0; i < arr.length; i++) {
            if (!counted[i]) {
                int count = 1;

                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        counted[j] = true;
                    }
                }

                System.out.println("Elemen " + arr[i] + " muncul sebanyak " + count + " kali");
                counted[i] = true;
            }
        }
    }
}

