package _바킹독_알고리즘.배열.배열_직접_구현;

public class Main2 {
    public static void main(String[] args) {
        /*
        배열 arr 합이 100인 서로 다른 위치의 두 원소가 존재하면 1, 존재하지 않으면 0
         */
        int result = 0;

        int[] arr = new int[1001];
        int[] occur = new int[101];
        arr[0] = 1;
        arr[1] = 23;
        arr[2] = 55;
        arr[3] = 77;
        arr[4] = 60;

        for (int i = 0; i < arr.length; i++) {
            if (occur[100 - arr[i]] == 1) {
                result = 1;
                break;
            } else {
                occur[arr[i]] = 1;
            }
        }

        System.out.println("result = " + result);

    }
}
