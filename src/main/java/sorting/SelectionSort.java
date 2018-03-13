package sorting;

import interfaces.Sortable;

public class SelectionSort implements Sortable {

    @Override
    public int[] sort(int[] arr) {
        if (arr.length == 0){
            throw new IllegalArgumentException("Array cannot be empty");
        }
        int length = arr.length;
        int smallestIndex;
        int temp;

        for (int i = 0; i < length - 1; i++) {
            smallestIndex = i;

            for (int j = i + 1; j < length; j++) {
                if (arr[j] < arr[smallestIndex]){
                    smallestIndex = j;
                }
            }
            temp = arr[smallestIndex];
            arr[smallestIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

}
