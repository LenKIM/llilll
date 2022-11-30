package exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

/**
 * * ![](https://tva1.sinaimg.cn/large/008vxvgGgy1h8n63y4f1jj30u0109mzk.jpg)
 */
public class _2 {

    public String solution(String[] leftArray, String[] rightArray) {
        if (leftArray.length <= 0 && rightArray.length <= 0) return "";

        HashSet<String> map = new HashSet<>(Arrays.asList(leftArray));
        List<String> result = new ArrayList<>();

        for (String s : rightArray) {
            if (map.contains(s)) {
                result.add(s);
            }
        }
        return result.stream()
                .distinct()
                .sorted()
                .collect(Collectors.joining(","));
    }

}
