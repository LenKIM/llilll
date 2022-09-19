/**
9:51
nums 에 있는 모든 0을 끝으로 보내기.

주의 -> copy 하지말고, in-place 로 하라.
**/

class Solution {
    public void moveZeroes(int[] nums) {
        for (int i=0; i < nums.length; i++) {
            for (int j=0; j < nums.length-1; j++) {
                
                if(nums[j] != 0) {
                    continue;
                } 
                
                swap(nums, j, j+1);   
            }
        }
        
    }
    
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}