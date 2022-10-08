package stacks;

import java.io.*;
import java.util.Stack;

public class BOJ_3015 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        String[] s = br.readLine().split(" ");
        int[] input = new int[s.length];
        int[] result = new int[s.length];
        for (int i = 0; i < N; i++) {
            input[i] = Integer.parseInt(s[i]);
        }

        Stack<Integer> stack = new Stack<>();

        for (int i = input.length - 1; i >= 0; i--) {

            while (!stack.isEmpty() && stack.peek() <= input[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }

            stack.push(input[i]);
        }
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < result.length; i++) {
            sb.append(result[i]).append(" ");
        }
        bw.write(sb.toString().trim());
        bw.close();
        br.close();

    }
}
