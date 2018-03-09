package searching;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class BinarySearchTest {
    private BinarySearch search;
    private int arr[] = new int[]{10, 20, 30, 40, 50, 60};

    @Before
    public void setUp() {
        search = new BinarySearch();
    }

    @Test
    public void forEmptyArrayThrowIllegalArgumentException() {
        int[] arr2 = new int[0];

        assertThatThrownBy(() -> search.binarySearch(arr2, 0))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Array cannot be empty");
    }

    @Test
    public void forANonExistingInArrayValueReturnMinus1() {

        assertThat(search.binarySearch(arr, 5)).isEqualTo(-1);
    }

    @Test
    public void forAValueBeingExactlyInTheMidOfTheArrReturnTheSame() {

        assertThat(search.binarySearch(arr, 30)).isEqualTo(30);
    }

    @Test
    public void forAValOfBeingLowerThanMidOfArrReturnTheSame() {

        assertThat(search.binarySearch(arr, 20)).isEqualTo(20);
    }

    @Test
    public void forAValBeingHigherThanMidOfTheArrReturnTheSame() {

        assertThat(search.binarySearch(arr, 50)).isEqualTo(50);
    }
}