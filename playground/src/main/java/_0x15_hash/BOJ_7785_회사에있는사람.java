package _0x15_hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * O(logN)에 구할 수 있다.
 */
public class BOJ_7785_회사에있는사람 {

    private static int N;
    private static StringTokenizer st;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        LinkedHashSet<String> set = new LinkedHashSet<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String command = st.nextToken();

            if (command.equals("enter")) {
                set.add(name);
            } else {
                set.remove(name);
            }

        }
        set.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);


    }
}
