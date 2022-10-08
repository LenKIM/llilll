package queue;

import java.io.*;
import java.util.Deque;
import java.util.LinkedList;

public class BOJ_18258 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Deque<Integer> q = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            if (s.startsWith("push")) {
                String[] s1 = s.split(" ");
                q.add(Integer.parseInt(s1[1]));

            } else if (s.startsWith("front")) {
                if (q.isEmpty()) {
                    sb.append("-1").append("\n");
                    continue;
                }
                sb.append(q.getFirst()).append("\n");

            } else if (s.startsWith("back")) {
                if (q.isEmpty()) {
                    sb.append("-1").append("\n");
                    continue;
                }
                sb.append(q.getLast()).append("\n");

            } else if (s.startsWith("size")) {
                sb.append(q.size()).append("\n");

            } else if (s.startsWith("empty")) {
                if (q.isEmpty()) {
                    sb.append("1").append("\n");
                } else {
                    sb.append("0").append("\n");
                }
            } else if (s.startsWith("pop")) {
                if (q.isEmpty()) {
                    sb.append("-1").append("\n");
                } else {
                    sb.append(q.pollFirst()).append("\n");
                }
            }
        }


        bw.write(sb.toString().trim());
        bw.close();
        br.close();
    }
}
