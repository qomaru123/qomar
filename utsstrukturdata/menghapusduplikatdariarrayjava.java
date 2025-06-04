
public class menghapusduplikatdariarrayjava {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 5};

        int[] uniqueArray = removeDuplicates(array);

        System.out.print("Array tanpa duplikat: ");
        printArray(uniqueArray);
    }

    // Method untuk menghapus duplikat tanpa Set
    public static int[] removeDuplicates(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int newSize = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < newSize; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[newSize] = arr[i];
                newSize++;
            }
        }

        // Buat array dengan ukuran baru
        int[] result = new int[newSize];
        for (int i = 0; i < newSize; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    // Method untuk mencetak array
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
