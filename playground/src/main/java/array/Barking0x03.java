package array;

/**
 * 주어진 길이 N의 int 배열 arr에서 합이100인 서로 다른 위치의 두 원소가 존재하면 1을
 * 존재하지 않으면 0을 반환하는 함수 fun2(int arr[], int N)을 작성하라.
 * arr의 각 수는 0이상 100이하이고 N은 1000 이하이다.* * *
 */
public class Barking0x03 {

    public static void main(String[] args) {
        Barking0x03 barking0x03 = new Barking0x03();

        int[] ints = {1, 23, 53, 77, 60};
        int i = barking0x03.fun2(ints, 5);
        System.out.println(i);
    }

    public int fun2(int arr[], int N) {
/**
 * 문제에서 100까지라 했으니까.*
 */

        int [] maps = new int[101];
        for (int i = 0; i < arr.length; i++) {
            if (maps[100 - maps[i]] == 1) {
                return 1;
            }
            maps[100-maps[i]] = 1;
        }

        return -1;
    }

}
