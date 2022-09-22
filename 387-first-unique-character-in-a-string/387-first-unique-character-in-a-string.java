/**
반복되지 않는 첫번째 문자의 인덱스을 찾아라

효과적으로 찾아야 한다.
**/
class Solution {
    public int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        int index = -1;

        Set<Character> duplcatedChar = new HashSet<>();

        for (int i=0; i < chars.length; i++) {

            boolean found = false;
            for(int j=0; j < chars.length; j++) {

                if (i == j){
                    continue;
                }

                if (chars[i] == chars[j]) {
                    found = true;
                    break;
                }
            }

            if(!found) {
                return i;
            }

        }
        return index;
    }
}