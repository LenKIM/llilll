class Solution {
    public int pivotIndex(int[] nums) {
        
        for (int pivotIndex=0; pivotIndex < nums.length; pivotIndex++) {
            
            int leftSum = 0;
            int rightSum = 0;
            
            for (int i=0; i < pivotIndex; i++) {
                leftSum += nums[i];
            }
            
            for (int j = pivotIndex+1; j < nums.length; j++) {
                rightSum += nums[j];
            }
            
            if (leftSum == rightSum) {
                return pivotIndex;
            }
        }
        return -1;
    }
}