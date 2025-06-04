public class menggabungkan2arrayjava{
    public static void main(String[] args) {
        // Inisialisasi dua array langsung
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};

        // Gabungkan kedua array
        int[] mergedArray = mergeArrays(array1, array2);

        // Cetak hasil penggabungan
        System.out.print("Array gabungan: ");
        printArray(mergedArray);
    }

    // Method untuk menggabungkan dua array
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];

        // Salin elemen array pertama
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }

        // Salin elemen array kedua
        for (int i = 0; i < arr2.length; i++) {
            result[arr1.length + i] = arr2[i];
        }

        return result;
    }

    // Method untuk mencetak isi array
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
