package greedy.leetcode._409;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        int abccccdd = new Solution().longestPalindrome2("aaa");
        System.out.println(abccccdd);
    }

    public int longestPalindrome(String s) {

        char[] chars = s.toCharArray();
        // 짝수일 경우는 만들 수 있다.
        // 짝수 갯수가 2개, 4,6,8
        // 홀수는 딱 한 개만 가능하다.

        // 26 . 52개
        int[] map = new int[53];
        for (char aChar : chars) {
            int c = aChar - 'A';
            map[c] = map[c] + 1;
        }
        int ans = 0;
        boolean hasOdd = false;
        boolean hasOdd2 = false;

        for (int i = 0; i < map.length; i++) {
            if (map[i] > 0 && (map[i] % 2 == 0)) {
                ans += map[i];
                continue;
            }

            if (map[i] == 1 && (map[i] % 2 == 1)) {
                hasOdd = true;
            }

            if (map[i] > 1 && (map[i] % 2 == 1)) {
                ans += map[i];
                hasOdd2 = true;
            }
        }

        if (hasOdd && (!hasOdd2)) ans +=1;

        return ans;

    }

    public int longestPalindrome2(String s) {
        int[] count = new int[128];
        for (char c: s.toCharArray())
            count[c]++;

        int ans = 0;
        for (int v: count) {
            ans += (v / 2) * 2;
            if (ans % 2 == 0 && v % 2 == 1)
                ans++;
        }
        return ans;
    }

//    public int longestPalindrome(String s) {
//
//        int ans = 0;
//        for (int i = 0; i <= s.length(); i++) {
//
//            for (int j = i + 1; j <= s.length(); j++) {
//                String substring = s.substring(i, j);
//                String reverse = new StringBuilder(substring).reverse().toString();
//
//                if (substring.equals(reverse)
//                        && substring.length() > ans) {
//                    ans = substring.length();
//                }
//
//            }
//        }
//
//        return ans;
//
//    }
}
