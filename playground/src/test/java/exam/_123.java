package exam;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class _123 {

    @Test
    void name() {
//        int[] a = new int[]{1,2,4,4,3};
//        int[] b = new int[]{2,3,1,3,1};

        int[] a = new int[]{1, 2, 1, 3};
        int[] b = new int[]{2, 4, 3, 4};
        solution(4, a, b);
    }

    static List<Integer> adjList[];
    static boolean[] visited;


    public boolean solution(int N, int[] A, int[] B) {
        adjList = new ArrayList[N + 1];
        visited = new boolean[N + 1];

        for (int i = 1; i < N + 1; i++) {
            adjList[i] = new ArrayList<>();
        }
        int answer = 0;
        for (int i = 0; i < A.length; i++) {
            int v1 = A[i];
            int v2 = B[i];
            adjList[v1].add(v2);
            adjList[v2].add(v1);
        }

        dfs(1, N);

        for (int i = 1; i <=N ; i++) {
            if (visited[i] == false){
                return false;
            }
        }
        return true;
    }
    static boolean isEnd = false;
    static void dfs(int st, int N) {
        visited[st] = true;
        if (isEnd) return;

        if (st == N) isEnd = true;
        for (int i : adjList[st]) {
            if (visited[i] || isEnd == true) continue;
            visited[i] = true;
            dfs(i, N);
        }
    }

//    static void bfs(int st, int N) {
//        Deque<Integer> q = new ArrayDeque<>();
//        q.add(st);
//        visited[st] = true;
//
//        while (!q.isEmpty()) {
//            Integer integer = q.pollFirst();
//            if (integer == N) return;
//
//            for (int i : adjList[integer]) {
//                if (visited[i]) continue;
//                q.push(i);
//                visited[i] = true;
//            }
//        }
//    }

}
