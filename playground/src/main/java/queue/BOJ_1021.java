package queue;

import java.io.*;
import java.util.LinkedList;

public class BOJ_1021 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);

        LinkedList<Integer> deque = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            deque.add(i);
        }

        String[] s1 = br.readLine().split(" ");

        int count = 0;

        for (String value : s1) {

            int input = Integer.parseInt(value);

            int targetIdx = deque.indexOf(input);

            int halfIdx;
            if (deque.size() % 2 == 0) halfIdx = deque.size() / 2 - 1;
            else halfIdx = deque.size() / 2;

            if (targetIdx <= halfIdx) {

                for (int j = 0; j < targetIdx; j++) {
                    int temp = deque.pollFirst();
                    deque.offerLast(temp);
                    count++;
                }

            } else {

                for (int j = 0; j < deque.size() - targetIdx; j++) {
                    Integer temp = deque.pollLast();
                    deque.offerFirst(temp);
                    count++;
                }
            }
            deque.pollFirst();
        }

        bw.write(count + "");
        bw.close();
        br.close();
    }
}
