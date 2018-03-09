package searching;

public class BinarySearch {

    public int binarySearch(int[] arr, int number) {
        if (arr.length == 0){
            throw new IllegalArgumentException("Array cannot be empty");
        }
        int low = 0;
        int high = arr.length - 1;
        int mid;
        int guess;

        while (low <= high) {
            mid = (low + high) / 2;
            guess = arr[mid];

            if (guess == number) {
                return number;
            }
            if (guess > number) {
                high = mid - 1;
            }
            if (guess < number) {
                low = mid + 1;
            }
        }
        return -1;
    }
}
