package exam;

import java.util.Arrays;
import java.util.Locale;

/**
 * ![](https://tva1.sinaimg.cn/large/008vxvgGgy1h8n5uhhdowj326s0su77v.jpg)
 */
public class _1 {

    public String solution(String[] strings) {
        return Arrays.stream(strings)
                .filter(s -> s.length() >= 5 && s.length() <= 10)
                .findFirst()
                .orElse("없음")
                .toUpperCase(Locale.ROOT);
    }
}
