package math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11050 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int ret = 1;
        for (int i = 1; i <= n; i++) ret *= i;
        for (int i = 1; i <= k; i++) ret /= i;
        for (int i = 1; i <= n - k; i++) ret /= i;

        System.out.println(ret);

    }

//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int k = sc.nextInt();
//
//        int result = factorial(n) / (factorial(n - k) * factorial(k));
//        System.out.println(result);
//
//    }
//
//    static int factorial(int n){
//        if(n == 1 || n == 0)
//            return 1;
//        else
//            return factorial(n-1) * n;
//    }
}
