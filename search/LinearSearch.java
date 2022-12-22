package Algorithm;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {30, 40, 50, 60, 70, 80, 90};
        int elementToSearch = 90;
        int result = linearSearch(arr, elementToSearch);

        if (result == -1)
            System.out.println(elementToSearch + " not found ");
        else {
            System.out.println("[ " + elementToSearch + " ]" + " found at index: " + result);
        }
    }

    public static int linearSearch(int[] arr, int elementToSearch) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elementToSearch) {
                return i;
            }
        }
        return -1;
    }
}
