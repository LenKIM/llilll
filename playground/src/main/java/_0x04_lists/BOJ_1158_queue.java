package _0x04_lists;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * 요세푸스 문제*
 * 11:55*
 */
public class BOJ_1158_queue {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            q.offer(i);
        }

        StringBuilder builder = new StringBuilder();
        builder.append("<");


        while (q.size() != 1) {

            for (int i = 0; i < K - 1; i++) {
                q.offer(q.poll());
            }
            builder.append(q.poll() + ", ");
        }

        builder.append(q.poll() + ">");

        bw.write(builder + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
