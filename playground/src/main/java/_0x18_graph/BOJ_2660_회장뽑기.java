package _0x18_graph;

import java.util.*;

public class BOJ_2660_회장뽑기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a == -1 && b == -1)
                break;

            if (map.containsKey(a)) {
                map.get(a).add(b);
            } else {
                List<Integer> temp = new LinkedList<Integer>();
                temp.add(b);
                map.put(a, temp);
            }

            if (map.containsKey(b)) {
                map.get(b).add(a);
            } else {
                List<Integer> temp = new LinkedList<Integer>();
                temp.add(a);
                map.put(b, temp);
            }
        }

        List<Node> lst = new LinkedList<Node>();
        for (int i = 1; i <= N; i++) {
            lst.add(new Node(BFS(N, i, map), i));
        }
        Collections.sort(lst);

        int cnt = 0;
        int minNum = lst.get(0).num;
        List<Integer> answer = new LinkedList<>();
        while (true) {
            answer.add(lst.get(cnt).idx);
            cnt++;
            if (cnt == lst.size() || minNum != lst.get(cnt).num)
                break; // lst.get(cnt)를 할때 indexoutofbounds가 발생할 수 있기 때문에 cnt == list.size()라는 조건을 추가합니다.
        }
        StringBuilder sb = new StringBuilder();
        sb.append(minNum + " " + answer.size() + "\n");
        for (int i = 0; i < answer.size(); i++) {
            sb.append(answer.get(i) + " ");
        }
        System.out.println(sb.toString());

    }

    public static class Node implements Comparable<Node> { // Comparator를 상속받으면 Collections.sort(lst)를 할 수 없습니다.
        int num;
        int idx;

        public Node(int num, int idx) {
            super();
            this.num = num;
            this.idx = idx;
        }

        @Override
        public String toString() {
            return "Node [num=" + num + ", idx=" + idx + "]";
        }

        @Override
        public int compareTo(Node o) {
            return (this.num == o.num) ? this.idx - o.idx : this.num - o.num;
        }

    }

    public static Integer BFS(int N, int start, HashMap<Integer, List<Integer>> map) {
        boolean[] v = new boolean[N + 1];
        v[start] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        int cnt = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            cnt++;
            while (--size >= 0) {
                int now = q.poll();
                for (Integer candidate : map.get(now)) {
                    if (v[candidate])
                        continue;
                    v[candidate] = true;
                    q.add(candidate);
                }
            }
        }
        return cnt - 1;

    }
}
