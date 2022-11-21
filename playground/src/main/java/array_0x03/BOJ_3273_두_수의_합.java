package array_0x03;

import java.util.Scanner;

public class BOJ_3273_두_수의_합 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine().trim());

        char[] nums = sc.nextLine().toCharArray();

        int x = Integer.parseInt(sc.nextLine().trim());

        int[] maps = new int[1000000];

        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            if (maps[x - nums[i]] >= 1) {
                result = result + 1;
            }
            maps[nums[i]] = 1;
        }
        System.out.println(result);
    }
}
