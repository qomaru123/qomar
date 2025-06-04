public class membalikelemenarray {
    public static void main(String[] args) {
        // Inisialisasi array secara langsung
        int[] array = {1, 2, 3, 4, 5};

        // Cetak array sebelum dibalik
        System.out.print("Array sebelum dibalik: ");
        printArray(array);

        // Balik array secara permanen
        reverseArray(array);

        // Cetak array setelah dibalik
        System.out.print("Array setelah dibalik: ");
        printArray(array);
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

    // Method untuk membalik array secara permanen
    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Tukar elemen di posisi kiri dan kanan
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Geser posisi
            left++;
            right--;
        }
    }
}

