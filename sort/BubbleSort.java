package Algorithm;

import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[10];
        randomNum(arr);
        System.out.println("Unsorted: ");
        print(arr);

        bubbleSort(arr);

        System.out.println("Sorted: ");
        print(arr);
    }

    private static void bubbleSort(int[] arr){
        boolean swapItem = false;
        while (!swapItem) {
            swapItem = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    swapItem = false;
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

    private static void print(int[] arr){
        for (int j : arr) {
            System.out.println(j);
        }
    }

    private static void randomNum(int[] num){
        for (int i = 0; i < num.length;i++){
            Random random = new Random();
            num[i] = random.nextInt(20);
        }
    }
}

