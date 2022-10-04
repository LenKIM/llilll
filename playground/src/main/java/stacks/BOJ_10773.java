package stacks;

import java.io.*;
import java.util.Stack;

public class BOJ_10773 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int K = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < K; i++) {


            int xx = Integer.parseInt(br.readLine());
            if (xx == 0) {
                stack.pop();
            } else {
                stack.add(xx);
            }
        }

        Integer reduce = stack.stream().reduce(0, Integer::sum);

        bw.write(reduce+"");

        br.close();
        bw.close();
    }
}
