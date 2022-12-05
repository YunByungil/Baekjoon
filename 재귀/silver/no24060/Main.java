package 재귀.silver.no24060;

public class Main {

    static int number = 8;
    static int[] sorted = new int[8];

    public static void main(String[] args) {
        int[] arr = {7, 6, 5, 8, 3, 5, 9, 1};
        mergeSort(arr, 0, number - 1);

        for (int i = 0; i < number; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void merge(int[] arr, int start, int middle, int end) {
        int i = start;
        int j = middle + 1;
        int k = start;

        while (i <= middle && j <= end) {
            if (arr[i] <= arr[j]) {
                sorted[k] = arr[i];
                i++;
            } else {
                sorted[k] = arr[j];
                j++;
            }
            k++;
        }

        if (i > middle) {
            for (int t = j; t <= end; t++) {
                sorted[k] = arr[t];
                k++;
            }
        } else {
            for (int t = i; t <= middle; t++) {
                sorted[k] = arr[t];
                k++;
            }
        }
        // 정렬된 배열 삽입

        for (int t = start; t <= end; t++) {
            arr[t] = sorted[t];
        }
    }

    static void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int middle = (start + end) / 2;
            mergeSort(arr, start, middle);
            mergeSort(arr, middle + 1, end);
            merge(arr, start, middle, end);
        }
    }
}
