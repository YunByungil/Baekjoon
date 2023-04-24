package _바킹독_알고리즘.배열.배열_직접_구현;

import java.util.Vector;

public class Main {
    public static int len;
    public static int[] arr = new int[10];
    public static void main(String[] args) {
        insert_test();
        System.out.println("--------------------");
        erase_test();
    }

    public static void printArr(){
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void insert(int idx, int num, int arr[]){
        for (int i = len; i > idx; i--) {
            arr[i] = arr[i - 1];
        }
        arr[idx] = num;
        len++;
    }



    public static void insert_test(){
//        int arr[10] = {10, 20, 30};
        arr = new int[10];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;

        len = 3;
        insert(3, 40, arr); // 10 20 30 40
        printArr();
        insert(1, 50, arr); // 10 50 20 30 40
        printArr();
        insert(0, 15, arr); // 15 10 50 20 30 40
        printArr();
    }

    public static void erase_test(){
//        int arr[10] = {10, 50, 40, 30, 70, 20};
        arr = new int[10];
        arr[0] = 10;
        arr[1] = 50;
        arr[2] = 40;
        arr[3] = 30;
        arr[4] = 70;
        arr[5] = 20;
        len = 6;
        erase(4, arr); // 10 50 40 30 20
        printArr();
        erase(1, arr); // 10 40 30 20
        printArr();
        erase(3, arr); // 10 40 30
        printArr();
    }

    public static void erase(int idx, int arr[]){
        arr[idx] = 0;
        for (int i = idx; i < len; i++) {
            arr[i] = arr[i + 1];
        }
        len--;
    }
}
