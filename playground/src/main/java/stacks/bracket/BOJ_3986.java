package stacks.bracket;

import java.io.*;
import java.util.Stack;

public class BOJ_3986 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int ans = 0;

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            Stack<Character> stack = new Stack<>();
            for (int j = 0; j < s.length(); j++) {
                if (!stack.isEmpty() && stack.peek() == s.charAt(j)) stack.pop();
                else stack.push(s.charAt(j));
            }
            if (stack.isEmpty()) ans += 1;
        }
        sb.append(ans);
        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}
