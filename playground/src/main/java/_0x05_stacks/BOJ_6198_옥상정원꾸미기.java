package _0x05_stacks;

import java.io.*;
import java.util.Stack;

/**
 * * 도시에는 N개의 빌딩이 있다.
 *
 * 빌딩 관리인들은 매우 성실 하기 때문에, 다른 빌딩의 옥상 정원을 벤치마킹 하고 싶어한다.
 *
 * i번째 빌딩의 키가 hi이고, 모든 빌딩은 일렬로 서 있고 오른쪽으로만 볼 수 있다.
 *
 * i번째 빌딩 관리인이 볼 수 있는 다른 빌딩의 옥상 정원은 i+1, i+2, .... , N이다.
 *
 * 그런데 자신이 위치한 빌딩보다 높거나 같은 빌딩이 있으면 그 다음에 있는 모든 빌딩의 옥상은 보지 못한다.
 *
 * * *▸ 입력
 * 첫 번째 줄에 빌딩의 개수 N이 입력된다.(1 ≤ N ≤ 80,000)
 * 두 번째 줄 부터 N+1번째 줄까지 각 빌딩의 높이가 hi 입력된다. (1 ≤ hi ≤ 1,000,000,000)
 *
 * 입력에서 int 값을 벗어날 것이라는 것에 대해서 인지하지 못해 계속 오류가 발생함.* *
 * int > 2,147,483,647*
 */
public class BOJ_6198_옥상정원꾸미기 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        long sum = 0;
        for (int j = N; j > 0; j--) {
            int height = Integer.parseInt(br.readLine());
            while (!stack.isEmpty() && stack.peek() <= height) {
                stack.pop();
            }
            sum += stack.size();
            stack.add(height);
        }
        bw.write(sum + "");

        br.close();
        bw.close();
    }
}
