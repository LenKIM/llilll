package _0x0F_sort2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class XTest {

    @Test
    void zxczxc() {
//        int naabxxan = solution("NAABXXAN");
//        int naabxxan = solution("abccbd", new int[]{0,1,2,3,4,5});
//        int naabxxan2 = solution(new int[]{0,0,1,2}, new int[]{1,2});
        int naabxxan2 = solution(new int[]{0,0,0,0,2,3,3}, new int[]{2,5,6});
        System.out.println(naabxxan2);
    }

    public int solution(int[] T, int[] A) {
        Set<Integer> alreadyGetSkill = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            int wantedSkill = A[i];
            while (wantedSkill != 0) {
                int previous = T[wantedSkill];
                alreadyGetSkill.add(wantedSkill);
                alreadyGetSkill.add(previous);
                wantedSkill = previous;
            }
        }
        return alreadyGetSkill.size();
    }

    public int solution3(String S, int[] C) {
        // 가장 낮은 비용을 남겨야 한다.
        char[] chars = S.toCharArray();
        List<Integer> dup = new ArrayList<>();
        for (int i = 0; i < chars.length-1; i++) {
            if (chars[i] == chars[i+1]) {
                int i1 = C[i];
                int i2 = C[i + 1];
                int max = Math.min(i1, i2);
                dup.add(max);
            }
        }
        return dup.stream().mapToInt(a -> a).sum();
    }

    public int solution2(String S) {

        char[] chars = S.toCharArray();

        int count = 0;
        boolean isGoing = true;
        while (isGoing) {
            List<String> targetCharacters = getTargetCharacters();
            for (int i = 0; i < chars.length; i++) {
                char aChar = chars[i];
                if (aChar == ' ') continue;
                if (targetCharacters.contains(aChar + "")) {
                    targetCharacters.remove(aChar + "");
                    chars[i] = ' ';
                }
            }

            if (!targetCharacters.isEmpty()) {
                isGoing = false;
                continue;
            }
            count = count + 1;
        }
        return count;
    }

    private List<String> getTargetCharacters() {
        List<String> list = new ArrayList<>();
        list.add("B");
        list.add("A");
        list.add("A");
        list.add("A");
        list.add("N");
        list.add("N");
        return list;
    }



}
