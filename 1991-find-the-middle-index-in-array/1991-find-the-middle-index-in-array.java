/**
문제를 해맸던 이유는 접근 방식이 잘못되었기 때문이다.
**/
class Solution {
    public int findMiddleIndex(int[] nums) {

        int size = nums.length;
        
        for(int i=0; i < size; i++) {
            
            int rightSum = 0;
            int leftSum = 0;
            
            for (int j = 0; j < i; j++) {
                leftSum = leftSum + nums[j];
            }
            
            for (int z = i+1; z < size; z++) {
                rightSum = rightSum + nums[z];
            }
            
            if (leftSum == rightSum) {
                return i;
            }
            
        }
        return -1;
    }
}