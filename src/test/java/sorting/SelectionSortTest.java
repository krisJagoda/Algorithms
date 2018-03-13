package sorting;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class SelectionSortTest {
    private SelectionSort selectionSort;
    private int[] unsortedArr = new int[]{5, 10, 2, 33, 100, 0, 200};

    @Before
    public void setUp() throws Exception {
        selectionSort = new SelectionSort();
    }

    @Test
    public void forEmptyArrayThrowIllegalArgumentException() {
        int[] arr2 = new int[0];

        assertThatThrownBy(() -> selectionSort.sort(arr2))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Array cannot be empty");
    }

    @Test
    public void forAUnsortedIntArrReturnSortedIntArr() {
        int[] sortedArr = new int[]{0, 2, 5, 10, 33, 100, 200};

        assertThat(selectionSort.sort(unsortedArr)).isEqualTo(sortedArr);
    }
}