package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_5014 {
    private static int F, S, G, U, D;
    final static int MAX = 1000_000;
    static int[] distance;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        F = Integer.parseInt(st.nextToken()); // 총 F층
        S = Integer.parseInt(st.nextToken()); // 현재 S
        G = Integer.parseInt(st.nextToken()); // 목적지 G
        U = Integer.parseInt(st.nextToken()); // 위로 갈 수 있는 U층
        D = Integer.parseInt(st.nextToken()); // 아래로 D층을 가는 버튼

        distance = new int[MAX + 1];
        visited = new boolean[MAX + 1];

        boolean exit = false;

        Queue<Integer> q = new LinkedList<>();
        distance[S] = 0;
        q.offer(S);
        visited[S] = true;

        while (!q.isEmpty()) {
            Integer cur = q.poll();
            if (cur == G) {
                exit = true;
                break;
            }

            if (cur + U >= 1 && cur + U <= F && !visited[cur + U]) {
                int nextTemp = cur + U;
                distance[nextTemp] = distance[cur] + 1;
                visited[nextTemp] = true;
                q.offer(nextTemp);
            }

            if (cur - D >= 1 && cur - D <= F && !visited[cur - D]) {
                int nextTemp = cur - D;
                distance[nextTemp] = distance[cur] + 1;
                visited[nextTemp] = true;
                q.offer(nextTemp);
            }
        }

        if (exit) {
            System.out.println(distance[G]);
        } else {
            System.out.println("use the stairs");
        }

    }
}
