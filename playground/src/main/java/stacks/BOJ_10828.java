package stacks;

import java.io.*;
import java.util.Stack;

public class BOJ_10828 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            String s = br.readLine();

            if (s.startsWith("push")) {
                int e = Integer.parseInt(s.split(" ")[1]);
                stack.add(e);
                continue;
            }

            if (s.startsWith("pop")) {

                if (stack.isEmpty()) {
                    sb.append("-1");
                } else {
                    Integer pop = stack.pop();
                    sb.append(pop);
                }

            } else if (s.startsWith("size")) {

                sb.append(stack.size());

            } else if (s.startsWith("empty")) {

                if (stack.isEmpty()) {
                    sb.append("1");
                } else {
                    sb.append("0");
                }

            } else if (s.startsWith("top")) {

                if (stack.isEmpty()) {
                    sb.append("-1");
                } else {
                    sb.append(stack.peek());
                }
            }

            if (i != N - 1) sb.append("\n");
        }

        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}
