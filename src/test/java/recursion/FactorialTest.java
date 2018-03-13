package recursion;

import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class FactorialTest {
    private Factorial factorial;

    @Before
    public void setUp() throws Exception {
        factorial = new Factorial();
    }

    @Test
    public void forANegativeValueOThrowIllegalArgumentException() {

        assertThatThrownBy(() -> factorial.factorial(BigInteger.valueOf(-10)))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Value cannot be less than 0");
    }

    @Test
    public void forOReturn1() {

        assertThat(factorial.factorial(BigInteger.valueOf(0))).isEqualTo(BigInteger.ONE);
    }

    @Test
    public void for1Return1() {

        assertThat(factorial.factorial(BigInteger.valueOf(1))).isEqualTo(BigInteger.ONE);
    }

    @Test
    public void for5Return120() {

        assertThat(factorial.factorial(BigInteger.valueOf(5))).isEqualTo(BigInteger.valueOf(120));
    }
    @Test
    public void for6Return720() {

        assertThat(factorial.factorial(BigInteger.valueOf(6))).isEqualTo(BigInteger.valueOf(720));
    }
}