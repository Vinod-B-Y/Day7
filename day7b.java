package day7;
public class day7b {

    public static void main(String[] args) {

        String[] arr = {"Anil", "Anil", "Kiran", "Kiran", "Rahul", "Rahul", "Rahul", "Vishwas"};

        String target = "Rahul";

        int first = -1;
        int last = -1;

        int start = 0;
        int end = arr.length - 1;

        // Find FIRST occurrence
        while (start <= end) {

            int mid = (start + end) / 2;

            if (arr[mid].equals(target)) {

                first = mid;
                end = mid - 1;       // Search LEFT

            } 
            else if (arr[mid].compareTo(target) < 0) {

                start = mid + 1;     // Search RIGHT

            } 
            else {

                end = mid - 1;
            }
        }

        // Reset start and end
        start = 0;
        end = arr.length - 1;

        // Find LAST occurrence
        while (start <= end) {

            int mid = (start + end) / 2;

            if (arr[mid].equals(target)) {

                last = mid;
                start = mid + 1;     // Search RIGHT

            } 
            else if (arr[mid].compareTo(target) < 0) {

                start = mid + 1;

            } 
            else {

                end = mid - 1;
            }
        }

        System.out.println("First = " + first);
        System.out.println("Last = " + last);
    }
}