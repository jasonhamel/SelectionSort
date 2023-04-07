public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] numbers = new int[] {
                99,
                44,
                6,
                2,
                1,
                5,
                63,
                87,
                283,
                4,
                0
        };
        selectionSort(numbers);
    }

    public static void selectionSort(int[] unsorted) {
        for (int i = 0; i < unsorted.length; i++) {
            for (int j = i + 1; j < unsorted.length; j++) {
                if (unsorted[j] < unsorted[i]) {
                    int temp = unsorted[i];
                    unsorted[i] = unsorted[j];
                    unsorted[j] = temp;
                }
            }
        }
    }
}