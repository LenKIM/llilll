class Solution {
    // 나머지와 몫은 어떤 것으로 분류하지?
    
    public int numberOfSteps(int num) {
        
        int result = 0;
        while (num != 0) {
            result = result + 1;
            if(num % 2 == 0) {
                num = num / 2;
            } else {
                num = num - 1;
            }
        }
        return result;
    }
}