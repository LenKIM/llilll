package _0x0F_sort2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.Consumer;

public class BOJ_2910_빈도정렬 {

    private static int N;
    private static int C;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        Map<Integer, Integer> map = new LinkedHashMap<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int key = Integer.parseInt(st.nextToken());
            if (map.containsKey(key)) {
                Integer integer = map.get(key);
                integer++;
                map.put(key, integer);
            } else {
                map.put(key,1);
            }
        }
        StringBuilder sb = new StringBuilder();
        map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(
                        entry -> {
                            Integer key = entry.getKey();
                            Integer value = entry.getValue();
                            for (int i = 0; i < value; i++) {
                                sb.append(key).append(" ");
                            }
                        }
                );
        System.out.println(sb.toString().trim());
    }
}
