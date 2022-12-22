package Algorithm;

import java.util.Random;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = new int[100000];
        randomNum(arr);

        System.out.println("Before: ");
        print(arr);

        insertionSort(arr);

        System.out.println("After: ");
        print(arr);

    }

    public static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++){
            int current = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > current){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
    }

    private static void randomNum(int[] num){
        for (int i = 0; i < num.length;i++){
            Random random = new Random();
            num[i] = random.nextInt(20);
        }
    }

    private static void print(int[] arr){
        for (int j : arr) {
            System.out.println(j);
        }
    }
}
