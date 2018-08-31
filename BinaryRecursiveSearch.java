public class BinaryRecursiveSearch implements Practice2Search {
    @Override
    public String searchName() {
        return "Binary Recursive Search";
    }

    private int binarySearch(int[] arr, int target, int lower, int upper) {
        if (lower > upper) {
            // As the lower bound moves over the upper bound, it means that the target is not found.
            return -1;
        }
        int mid = (upper + lower) / 2;
        if (target == arr[mid]) {
            // If target is equal to the middle element, return the index of the middle element.
            return mid;
        } else if (target > arr[mid]) {
            // If target is larger than the middle element, shift lower bound to the next one of the middle element.
            return binarySearch(arr, target, mid+1, upper);
        } else if (target < arr[mid]) {
            // If target is smaller than the middle element, shift upper bound to the previous one of the middle element.
            return binarySearch(arr, target, lower, mid-1);
        }
        return -1;
    }

    @Override
    public int search(int[] arr, int target) {
        return binarySearch(arr, target, 0, arr.length-1);
    }
}
