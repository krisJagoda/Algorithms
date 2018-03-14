package recursion;

import java.util.Arrays;

public class RecursionExamples {

    public int sum(int[] arr){

        int n = arr.length;

        if (n == 0){
            return 0;
        }

        return arr[n - 1] + sum(Arrays.copyOf(arr, arr.length-1));
    }

    public int count(int[] arr){

        int n = arr.length;

        if (n == 0){
            return 0;
        }
        return 1 + count(Arrays.copyOf(arr, arr.length-1));
    }
}
