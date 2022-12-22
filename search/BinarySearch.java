package Algorithm;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {30, 40, 50, 60, 70, 80, 90};
        int elementToSearch = 90;
        int result = binarySearch(arr, elementToSearch, 0, arr.length - 1);

        if (result == -1)
            System.out.println(elementToSearch + " not found ");
        else {
            System.out.println("[ " + elementToSearch + " ]" + " found at index: " + result);
        }
    }

    public static int binarySearch(int[] arr, int elementToSearch, int low, int high) {
        for (int i = 0; i < arr.length; i++) {
            int mid = (low + high) / 2;

            if (arr[mid] == elementToSearch)
                return mid;

            else if (arr[mid] < elementToSearch)
                low = mid + 1;

            else
                high = mid - 1;
        }
        return -1;
    }
}
