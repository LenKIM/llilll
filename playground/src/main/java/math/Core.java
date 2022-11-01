package math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * *
 */
public class Core {

    boolean isPrime(int N) {
        if (N == 1) return false;
        for (int i = 2; i < N; i++) {
            if (N % i == 0) return false;
        }
        return true;
    }

    /**
     * * 루트N
     *
     * @param N
     * @return
     */
    boolean isPrime2(int N) {
        if (N == 1) return false;
        for (int i = 2; i * i <= N; i++) {
            if (N % i == 0) return false;
        }
        return true;
    }

    List<Integer> sieve(int n) {
        List<Integer> primes = new ArrayList<>();
        boolean[] state = new boolean[n + 1];
        Arrays.fill(state, true);

        state[1] = false;
        for (int i = 2; i <= n; i++) {
            if (!state[i]) continue;
            for (int j = 2 * i; j <= n; j += i) {
                state[j] = false;
            }
        }
        for (int i = 2; i <= n; i++) {
            if (state[i]) primes.add(i);
        }
        return primes;
    }

    List<Integer> sieve2(int n) {
        List<Integer> primes = new ArrayList<>();
        boolean[] state = new boolean[n + 1];
        Arrays.fill(state, true);

        state[1] = false;
        for (int i = 2; i*i <= n; i++) {
            if (!state[i]) continue;
            for (int j = i * i; j <= n; j += i) {
                state[j] = false;
            }
        }
        for (int i = 2; i <= n; i++) {
            if (state[i]) primes.add(i);
        }
        return primes;
    }
}
