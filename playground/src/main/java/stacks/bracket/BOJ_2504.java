package stacks.bracket;

import java.io.*;
import java.util.Stack;

public class BOJ_2504 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        Stack<Character> st = new Stack<>();
        char[] chars = br.readLine().toCharArray();
        int length = chars.length;

        // [X] 은 3x 값(X)
        // (X) 은 2x 값(X)
        // [] 은 3 () 2
        int sum = 0;
        int num = 1; // 곱해질 값
        for (int i = 0; i < length; i++) {

            char aChar = chars[i];
            if (aChar == '(') {
                num *= 2;
                st.push(aChar);
            } else if (aChar == '[') {
                num *= 3;
                st.push(aChar);
            } else if (aChar == ')') {
                if (st.empty() || st.peek() != '(') {
                    sb.append("0");
                    break;
                }

                if (chars[i-1] == '(') sum += num; // 직전 괄호가 여는 괄호였다면 sum 에 값 추가
                st.pop();
                num /= 2;
            } else { // aChar == ']'
                if (st.empty() || st.peek() != '[') {
                    sb.append("0");
                    break;
                }

                if (chars[i-1] == '[') sum += num;
                st.pop();
                num /=3 ;
            }
        }
        if (st.empty()) sb.append(sum);
        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}
