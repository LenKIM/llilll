package _0x0E_sort1;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

/**
 * * 10,000,000 개의 갯수
 * *
 * 수는 10,000보다 작거나 같은 자연수*
 * 카운팅 정렬을 사용한다.*
 */
public class BOJ_11931_수_정렬하기4 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        Integer[] num = new Integer[Integer.parseInt(reader.readLine())];
        for (int i = 0; i < num.length; i++) num[i] = Integer.parseInt(reader.readLine());
        Arrays.sort(num, Collections.reverseOrder());
        for (Integer i : num) writer.write(i+"\n");
        writer.flush();
    }
}
