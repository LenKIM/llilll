package array_0x03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

class CoreTest {

    int[] abc;

    @BeforeEach
    void setUp() {

        abc = new int[]{2, 4, 6, 13, -2, 1, 3, 0, 5, 6};
    }

    @Test
    @DisplayName("임의의 위치에 있는 원소를 확인/변경 = O(1)")
    void check() {
        int i = abc[1];
        assertThat(i).isEqualTo(4);
    }

    @Test
    @DisplayName("원소를 끝에 추가 = O(1)")
    void insert() {
        int[] copied = Arrays.copyOf(abc, 11);
        int i = 15;
        int index = 5;
        // 추가메모리을 사용하지 않는 방법으로는 오른쪽이 아니라, 왼쪽부터 데이터를 옮기는 것이다.

//        System.arraycopy(copied, index, copied, index + 1, copied.length - 1 - index);
        for (int j = copied.length - 1; j > index; j--) {
            copied[j] = copied[j - 1];
        }
        copied[5] = 15;

        print(Arrays.toString(copied));
    }

    private void print(String xx) {
        System.out.println(xx);
    }

    @Test
    @DisplayName("마지막 원소를 제거 = O(1)")
    void erase() {
        int[] copied = Arrays.copyOf(abc, 10);
        int index = 2;
        // 2번째 인덱스 6을 삭제한다.
//        System.arraycopy(copied, index + 1, copied, index, copied.length - 1 - index);
        for (int i = index; i < copied.length - 1; i++) {
            copied[i] = copied[i + 1];
        }

        copied[copied.length-1] = 0;
//        print(Arrays.toString(copied));
        // 만약 배열에서 특정 값을 제거하고싶다면?
        int[] ints = Arrays.stream(copied)
                .filter(i -> i != 2).toArray();
        print(Arrays.toString(ints));

        // 만약 배열에서 특정 인덱스를 제거하고싶다면?
        int[] ints1 = IntStream.range(0, copied.length)
                .filter(i -> i != index)
                .map(i -> copied[i])
                .toArray();
//        https://codechacha.com/ko/java8-convert-stream-to-array/
//        https://www.techiedelight.com/remove-element-specific-index-array-java/
    }

    @Test
    @DisplayName("임의의 위치에 원소를 추가/임의 위치의 원소 제거 = O(N)")
    void xx() {


    }
}
