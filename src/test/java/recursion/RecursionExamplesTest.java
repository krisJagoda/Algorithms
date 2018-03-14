package recursion;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RecursionExamplesTest {
    private RecursionExamples recursion;
    private final int[] arr = new int[]{13, 5, 10, 20, 100};

    @Before
    public void setUp() throws Exception {
        recursion = new RecursionExamples();
    }

    @Test
    public void forEmptyArrReturn0() {
        int[] arr3 = new int[]{};

        assertThat(recursion.sum(arr3)).isEqualTo(0);
    }

    @Test
    public void forArrWithOneIndexReturnTheSame() {
        int[] arr4 = new int[1];
        arr4[0] = 2;

        assertThat(recursion.sum(arr4)).isEqualTo(2);
    }

    @Test
    public void forGivenArrOfIntegersReturnTheirSum() {

        assertThat(recursion.sum(arr)).isEqualTo(148);
    }

    @Test
    public void forEmptyArrayReturn0() throws Exception {
        int[] arr5 = new int[]{};

        assertThat(recursion.count(arr5)).isEqualTo(0);
    }

    @Test
    public void forArrWithOneValReturn1() throws Exception {
        int[] arr6 = new int[1];
        arr6[0] = 6;

        assertThat(recursion.count(arr6)).isEqualTo(1);
    }

    @Test
    public void forGivenArrReturnNumberOfItsElements() throws Exception {

        assertThat(recursion.count(arr)).isEqualTo(5);
    }
}