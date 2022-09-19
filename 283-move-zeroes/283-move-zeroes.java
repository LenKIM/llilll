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
/**
30분이 걸렸다.
머리로는 어떻게 푸는지 알겠는데, 손이 구현을 못한다.
버블정렬로 풀면 되겠다 싶었다.
근데, 구현이 안되었다.
j 이면 그 다음 j+1 이랑 교환했어야 했는데 그렇게 하지 못함.
**/