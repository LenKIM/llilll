class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] chars = s.toCharArray();
        int[] ints = new int[chars.length];
        Map<Character, Integer> map = new LinkedHashMap<>();
        int standard = 0;
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            if (map.containsKey(aChar)) {
                Integer integer = map.get(aChar);
                ints[i] = integer;
            } else {
                standard = standard + 1;
                map.put(aChar, standard);
                ints[i] = standard;
            }

        }

        char[] chars2 = t.toCharArray();
        int[] ints2 = new int[chars2.length];
        Map<Character, Integer> map2 = new LinkedHashMap<>();
        int standard2 = 0;
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars2[i];
            if (map2.containsKey(aChar)) {
                Integer integer = map2.get(aChar);
                ints2[i] = integer;
            } else {
                standard2 = standard2 + 1;
                map2.put(aChar, standard2);
                ints2[i] = standard2;
            }

        }

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] != ints2[i]) {
                return false;
            }
        }
        return true;

    }
}