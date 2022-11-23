package _0x04_lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Boj_1406 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String init = sc.nextLine();

        int M = Integer.parseInt(sc.nextLine());

        List<Character> strings = new ArrayList<>();
        char[] chars = init.toCharArray();
        for (char aChar : chars) {
            strings.add(aChar);
        }
        int cursor = strings.size() - 1;

        for (int i = 0; i < M; i++) {

            String s = sc.nextLine();
            s = s.trim();
            if (s.startsWith("L")) {
                if (cursor == 0) continue;

                cursor = cursor - 1;
            } else if (s.startsWith("D")) {
                if (cursor >= strings.size()) continue;

                cursor = cursor + 1;
            } else if (s.startsWith("B")) {
                if (cursor - 1 < 0) continue;
                strings.remove(cursor-1);
                cursor = cursor - 1;

            } else if (s.startsWith("P")) {
                char c1 = s.trim().charAt(2);
                strings.add(cursor, c1);
                cursor = cursor + 1;
            }
        }
        String collect = strings.stream().map(String::valueOf).collect(Collectors.joining());
        System.out.print(collect);
    }
}
