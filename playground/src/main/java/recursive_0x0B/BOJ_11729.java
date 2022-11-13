package recursive_0x0B;

import java.util.Scanner;

/**
 * 하노이 탑*
 * https://www.mathsisfun.com/games/towerofhanoi.html*
 * https://brenden.tistory.com/31
 * * *
 */
public class BOJ_11729 {

    public static int answer = 0;
    public static StringBuilder sb = new StringBuilder();

    public static void moveHanoiTower(int num, int from, int by, int to) {
        ++answer;
        // 이동할 원반의 수가 1개라면?
        if(num == 1) {
            sb.append(from + " " + to + "\n");
        } else {
            // STEP 1 : num-1개를 A에서 B로 이동
            moveHanoiTower(num-1, from, to, by);
            // STEP 2 : 1개를 A에서 C로 이동
            sb.append(from + " " + to + "\n");
            // STEP 3 : num-1개를 B에서 C로 이동
            moveHanoiTower(num-1, by, from, to);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        moveHanoiTower(num, 1, 2, 3);
        sb.insert(0, answer + "\n");
        System.out.println(sb);
    }

    private static void fun(int a, int b, int n) {
    }
}
