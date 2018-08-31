public class BinaryIterativeSearch implements Practice2Search {
    @Override
    public String searchName() {
        return "Binary Iterative Search";
    }

    @Override
    public int search(int[] arr, int target) {
        int lower = 0;
        int upper = arr.length - 1;
        while (lower <= upper) {
            // Same as recursive method but using a while loop so it loops until target is found (or not found if lower > upper).
            int mid = (upper + lower)/2;
            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                lower = mid + 1;
            } else if (target < arr[mid]) {
                upper = mid - 1;
            }
        }
        return -1;
    }
}
