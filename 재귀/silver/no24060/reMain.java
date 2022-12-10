package 재귀.silver.no24060;

public class reMain {
    static int[] temp;
    static int number = 5;
    static int count = 6;
    static int check = 0;
    static int result = -1;

    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 3, 2};

        temp = new int[number];

        mergeSort(arr, 0, number - 1);

//        for (int i : arr) {
//            System.out.println(i);
//        }
//
//        System.out.println("결과 : " + result);

    }

    static void merge(int[] arr, int start, int middle, int end) {
        int a = start;
        int b = middle + 1;
        int c = start;

        while (a <= middle && b <= end) {
            if (arr[a] <= arr[b]) {
                temp[c] = arr[a];
                a++;
            } else {
                temp[c] = arr[b];
                b++;
            }
            c++;
        }

        if (a > middle) {
            for (int i = b; i <= end; i++) {
                temp[c] = arr[i];
                c++;
            }
        } else {
            for (int i = a; i <= middle; i++) {
                temp[c] = arr[i];
                c++;
            }
        }

        a = start;
        c = start;

        while (a <= end) {
            arr[a++] = temp[c++];
            check++;
            if (count == check) {
                result = arr[a - 1];
                break;
            }
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
