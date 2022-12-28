package exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _2 {

    private static int descOrderingByKey(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
        return o2.getKey().compareTo(o1.getKey());
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < N; i++) {
            int s = Integer.parseInt(br.readLine());
            if (map.containsKey(s)) {
                Integer integer = map.get(s);
                integer = integer + 1;
                map.put(s, integer);
            } else {
                map.put(s, 1);
            }
        }

        List<Map.Entry<Integer, Integer>> entries = new LinkedList<>(map.entrySet());

        if (entries.size() < K) {
            System.out.print("IMPOSSIBLE");
            return;
        }

        int targetIndex = K - 1;
        Map.Entry<Integer, Integer> target = entries.get(targetIndex);
        int key = target.getKey();
        int value = target.getValue();
        System.out.print(key + " " + value);
    }
}
