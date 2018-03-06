package sorting;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BubbleSortTest {
    private BubbleSort bubbleSort = new BubbleSort();
    private int[] unsortedArr = new int[]{5, 10, 2, 33, 100, 0, 200};

    @Test
    public void forAUnsortedIntArrReturnSortedIntArr() {
        int[] sortedArr = new int[]{0, 2, 5, 10, 33, 100, 200};

        assertThat(bubbleSort.sort(unsortedArr)).isEqualTo(sortedArr);
    }

    @Test
    public void forAnUnsortedArrReturnReversedSortedArr() {
        int[] reversedSortedArr = new int[]{200, 100, 33, 10, 5, 2, 0};

        assertThat(bubbleSort.reverseSort(unsortedArr)).isEqualTo(reversedSortedArr);
    }
}