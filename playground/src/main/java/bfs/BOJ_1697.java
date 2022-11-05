package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1697 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] distance = new int[100_001];
        boolean[] isVisited = new boolean[100_001];

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(N);

        isVisited[N] = true;

        while (!queue.isEmpty()) {
            int cur = queue.poll();

            if (cur - 1 >= 0 && !isVisited[cur-1]) {
                int temp = cur - 1;
                queue.offer(temp);
                isVisited[temp] = true;
                distance[temp] = distance[cur] + 1;
            }

            if (cur + 1 <= 100_000 && !isVisited[cur+1]) {
                int temp = cur + 1;
                queue.offer(temp);
                isVisited[temp] = true;
                distance[temp] = distance[cur] + 1;
            }

            if (cur * 2 <= 100_000 && !isVisited[cur * 2]) {
                int temp = cur * 2;
                queue.offer(temp);
                isVisited[temp] = true;
                distance[temp] = distance[cur] + 1;
            }

        }

        System.out.println(distance[K]);

    }
}
