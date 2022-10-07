package stacks;

import java.io.*;
import java.util.Stack;

/**
 * 07:30* 08:06 -> 자바에서는 Stack 안에 타입을 자유롭게 가져가기 힘들다.
 * 그러인데, 타입을 선언하게 되는데, 생각의 전향이 쉽지 않다.*
 */
public class BOJ_2493 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int i = Integer.parseInt(br.readLine());
        int [] input = new int[500001];
        String[] s = br.readLine().split(" ");

        if (i != s.length) return;

        Stack<Pair<Integer, Integer>> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int j = 1; j <= s.length; j++) {
            int height = Integer.parseInt(s[j - 1]);
            while (!stack.isEmpty() && stack.peek().left < height) {
                stack.pop();
            }

            if (!stack.isEmpty()) {
                sb.append(stack.peek().right).append(" ");
            } else {
                sb.append(0 + " ");
            }

            stack.push(new Pair<>(height, j));
        }

        bw.write(sb.toString());

        bw.close();
        br.close();
    }

    private static class Pair<L, R> {

        L left;
        R right;

        public Pair(L left, R right) {
            this.left = left;
            this.right = right;
        }
    }
}
