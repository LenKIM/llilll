package _0x17_priorityQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class BOJ_11286_절댓값_힙 {

    private static PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> {
        int abs = Math.abs(o1);
        int abs2 = Math.abs(o2);
        if (abs == abs2) {
            return Integer.compare(o1, o2);
        }
        return Integer.compare(abs, abs2);
    });

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int v = Integer.parseInt(br.readLine());
            if (v == 0) {
                if (pq.isEmpty()) {
                    System.out.println(0);
                } else {
                    System.out.println(pq.poll());
                }

            } else {
                pq.add(v);
            }


        }

    }


}
