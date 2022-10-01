package array;

import java.io.IOException;
import java.util.Scanner;

public class Boj_2577 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int b = sc.nextInt();

        int c = sc.nextInt();

        if(!((a >= 100 && a < 1000) && (b >= 100 && b < 1000) && (c >= 100 && c < 1000))) return;

        int[] maps = new int[10];

        int i = a * b * c;
        String s = String.valueOf(i);
        for (char value : s.toCharArray()) {
            int aChar = value - '0';
            maps[aChar] = maps[aChar] + 1;
        }

        for (int map : maps) {
            System.out.println(map);
        }
    }
}
