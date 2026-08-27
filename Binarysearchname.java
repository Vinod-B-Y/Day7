package day7;

import java.util.Arrays;

public class Binarysearchname {

    static int binarySearch(String[] arr, String key) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid].equals(key)) {
                return mid;
            } else if (key.compareTo(arr[mid]) > 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String[] arr = {"RAJU", "JAGGU", "OGGY", "ASH", "BHEEM","JACK", "BEN", "MAX", "OLLY", "SHINCHAN"};

        String key = "RAJU";

        Arrays.sort(arr);

        int result = binarySearch(arr, key);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}