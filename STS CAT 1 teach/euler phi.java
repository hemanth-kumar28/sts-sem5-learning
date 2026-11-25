// if two numbers of gcd of 1 then they are co prime
// totient func totient(11) returns how many numbers are coprime within 11s
import java.math.*;

static int totient(int n) {
    int count = 0;

    for (int i = 1; i <= n; i++) {
        if (BigInteger.valueOf(i)
                .gcd(BigInteger.valueOf(n))
                .equals(BigInteger.ONE))
            count++;
    }

    return count;
}