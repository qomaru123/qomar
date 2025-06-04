public class mengurutkanarraynamadanmencetakindeksjava {
    public static void main(String[] args) {
        String[] names = {"husna", "sihab", "eris", "devi", "Eka", "sarat", "dwi"};

        // Insertion Sort
        String[] insertionSorted = names.clone();
        insertionSort(insertionSorted);
        System.out.print("Insertion Sort: ");
        printArray(insertionSorted);

        // Selection Sort
        String[] selectionSorted = names.clone();
        selectionSort(selectionSorted);
        System.out.print("Selection Sort: ");
        printArray(selectionSorted);

        // Bubble Sort
        String[] bubbleSorted = names.clone();
        bubbleSort(bubbleSorted);
        System.out.print("Bubble Sort: ");
        printArray(bubbleSorted);
    }

    // Insertion Sort
    public static void insertionSort(String[] arr) {
        for (int i = 1; i < arr.length; i++) {
            String key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareToIgnoreCase(key) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    // Selection Sort
    public static void selectionSort(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareToIgnoreCase(arr[minIdx]) < 0) {
                    minIdx = j;
                }
            }
            // Swap
            String temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
    }

    // Bubble Sort
    public static void bubbleSort(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].compareToIgnoreCase(arr[j + 1]) > 0) {
                    // Swap
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Method untuk mencetak array string
    public static void printArray(String[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
