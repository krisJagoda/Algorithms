package recursion;

import java.math.BigInteger;

public class Factorial {

    BigInteger factorial(BigInteger n){
        int result = n.compareTo(BigInteger.ZERO);

        if (result < 0){
            throw new IllegalArgumentException("Value cannot be less than 0");
        }

        if (n.equals(BigInteger.ZERO) || n.equals(BigInteger.ONE)){
            return BigInteger.ONE;
        }

        return n.multiply(factorial(n.subtract(BigInteger.ONE)));
    }
}
