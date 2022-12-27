package _0x11_greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

/**
 * 1. O(2^n)
 * 모든 가능한 배정 방법을 확인
 * <p>
 * 2. O(N^2)
 * - 회의를 끝나는 시간이 빠른 순으로, 끝나는 시간이 같다면 시작 시간이 빠른 순으로 정렬
 * - D[i] = i 번째 회의를 마지막으로 진행했을 때 최대 회의의 수
 * - D[i] = max(D[j]) + 1 (j번째 회의의 끝나는 시간이 i번째 회의의 시작 시간 이하인 모든 j)
 */
public class BOJ_1931_회의실배정 {

    private static int N;
    private static Room[] S;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        S = new Room[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            S[i] = new Room(start, end);
        }

        Arrays.sort(S, (o1, o2) -> {
            if (o1.endTime == o2.endTime) {
                return Integer.compare(o1.startTime, o2.startTime);
            }

            return Integer.compare(o1.endTime, o2.endTime);
        });

        int ans = 0;
        int t = 0;
        for (int i = 0; i < N; i++) {
            if (t > S[i].startTime) continue;
            ans++;
            t = S[i].endTime;
        }
        System.out.println(ans);
    }

    private static class Room {

        int startTime;
        int endTime;

        public Room(int startTime, int endTime) {
            this.startTime = startTime;
            this.endTime = endTime;
        }
    }
}
