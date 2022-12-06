package _0x0E_sort1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11728_배열합치기 {

    private static int N, M;
    private static int[] arrayN;
    private static int[] arrayM;
    private static int[] totalArray;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arrayN = new int[N];
        arrayM = new int[M];
        totalArray = new int[N + M];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arrayN[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            arrayM[i] = Integer.parseInt(st.nextToken());
        }

        int nIdx = 0;
        int mIdx = 0;
        for (int i = 0; i < N + M; i++) {
            if (mIdx == M) totalArray[i] = arrayN[nIdx++];
            else if (nIdx == N) totalArray[i] = arrayM[mIdx++];
            else if (arrayN[nIdx] <= arrayM[mIdx]) totalArray[i] = arrayN[nIdx++];
            else totalArray[i] = arrayM[mIdx++];
        }

        for (int i = 0; i < totalArray.length; i++) {
            if (i == totalArray.length - 1) {
                System.out.print(totalArray[i]);
            } else {
                System.out.print(totalArray[i] + " ");
            }

        }
    }

}
