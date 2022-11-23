package _0x03_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BOJ_10808_알파벳_갯수 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] input = br.readLine().toCharArray();

        int[] maps = new int[26];

        for (char c : input) {
            maps[c - 'a'] = maps[c - 'a'] + 1;
        }
        List<String> collect = Arrays.stream(maps)
                .boxed()
                .map(String::valueOf)
                .collect(Collectors.toList());

        String join = String.join(" ", collect);
        System.out.println(join);
    }
}
