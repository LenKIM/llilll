package stacks.bracket;

import java.io.*;
import java.util.Stack;

public class BOJ_9012 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        while (N-- > 0) {
            String line = br.readLine();
            Stack<Character> stack = new Stack<>();

            boolean isNo = true;
            char[] chars = line.toCharArray();
            for (char aChar : chars) {

                if (aChar == '(') {
                    stack.push(aChar);

                } else if (aChar == ')') {

                    if (!stack.isEmpty() && stack.peek() == '(') {
                        stack.pop();
                    } else {
                        isNo = false;
                    }
                }
            }

            if (stack.isEmpty() && isNo) {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }

        }

        bw.write(sb.toString());

        bw.close();
        br.close();
    }
}
