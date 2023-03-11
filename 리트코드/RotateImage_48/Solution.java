package 리트코드.RotateImage_48;

public class Solution {
    public static int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };

    public static void main(String[] args) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = arr[i][j];
                System.out.println("arr["+i+"]["+j+"] = " + arr[i][j]);
                arr[i][j] = arr[j][i];
                System.out.println("arr["+j+"]["+i+"] = " + arr[j][i]);
                arr[j][i] = temp;
            }
            System.out.println("========================");
        }
        System.out.println("n / 2 = " + n / 2);
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n / 2; j++) {
//                int temp = arr[i][j];
//                arr[i][j] = arr[i][n - 1- j];
//                arr[i][n - 1 - j] = temp;
//            }
//        }



        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
