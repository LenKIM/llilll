package _0x04_lists;

import java.io.*;
import java.util.Stack;

/**
 * * 한시간 넘게 걸렸음.
 * 문제. 시간제한이 1초이다. StringBuffer 또는 List 로 풀 수 없다.*
 * Stack 을 통해 풀어야 제한시간 내에 풀 수 있다.
 * * *
 */
public class Boj_5397 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            Stack<Character> pwdStack = new Stack<>();
            Stack<Character> deleteStack = new Stack<>();
            for (int j = 0; j < line.length(); j++) {
                char pos = line.charAt(j);
                if (pos == '<') {
                    if (!pwdStack.isEmpty()) {
                        deleteStack.push(pwdStack.pop());
                    }
                } else if (pos == '>') {
                    if (!deleteStack.isEmpty()) {
                        pwdStack.push(deleteStack.pop());
                    }
                } else if (pos == '-') {
                    if (!pwdStack.isEmpty()) {
                        pwdStack.pop();
                    }
                } else {
                    pwdStack.push(line.charAt(j));
                }
            }

            while (!deleteStack.isEmpty()) {
                pwdStack.push(deleteStack.pop());
            }

            for (int k = 0; k < pwdStack.size(); k++) {
                bw.write(pwdStack.get(k));
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
    }
}
