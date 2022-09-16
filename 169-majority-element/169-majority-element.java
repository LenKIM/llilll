/**
* 8h 50m
**/
class Solution {
    public int majorityElement(int[] nums) {
        
        Map<Integer, Integer> map = new HashMap<>();        
        for (int i: nums) {
            map.merge(i, 1, Integer::sum);    
        }
        
        Set<Integer> integers = map.keySet();
        int max = Integer.MIN_VALUE;
        int result = Integer.MIN_VALUE;
        
        for(Integer i : integers) {
            int count = map.get(i);
            if (count > max) {
                max = count;
                result = i;
            }
        }
        return result;
    }
}