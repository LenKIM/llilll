package _0x05_stacks;

import java.io.*;
import java.util.Stack;

/**
 * 지문을 이해하는게 아려운 문제*
 */
public class BOJ_1874_스택수열 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        int start = 0;

        while (N-- > 0) {

            int value = Integer.parseInt(br.readLine());

            if (value > start) {

                for (int i = start + 1; i <= value; i++) {
                    stack.push(i);
                    sb.append('+').append('\n');
                }
                start = value;

            } else if (stack.peek() != value) {
                System.out.println("NO");
                return;
            }

            stack.pop();
            sb.append("-").append("\n");
        }
        bw.write(sb.toString());

        bw.close();
        br.close();
    }
}
