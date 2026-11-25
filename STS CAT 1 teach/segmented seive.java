import java.util.*;

class Main {

    static boolean[] sieve(int n) {
        boolean[] prime = new boolean[n + 1];

        Arrays.fill(prime, true);
        prime[0] = false;
        if (n >= 1) prime[1] = false;

        for (int i = 2; i <= n / i; i++) {
            if (!prime[i]) continue;

            for (long j = i * i; j <= n; j += i)
                prime[(int) j] = false;
        }

        return prime;
    }

    static void segmentedSieve(int left, int right) {

        int limit = (int) Math.sqrt(right);
        boolean[] prime = sieve(limit);

        boolean[] segment = new boolean[right - left + 1];
        Arrays.fill(segment, true);

        for (int i = 2; i <= limit; i++) {
            if (!prime[i]) continue;

            long start = Math.max(
                (long) i * i,
                ((left + (long) i - 1) / i) * i
            );

            for (long j = start; j <= right; j += i)
                segment[(int) (j - left)] = false;
        }

        for (int i = 0; i < segment.length; i++) {
            if (segment[i] && i + left >= 2)
                System.out.print((i + left) + " ");
        }
    }

    public static void main(String[] args) {
        segmentedSieve(10, 30);
    }
}