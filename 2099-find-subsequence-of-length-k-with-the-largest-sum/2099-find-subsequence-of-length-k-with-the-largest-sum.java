/**
start >>> 05:13

k 가 주어지면 nums 에서 k개 만큼 집어서 가장 큰 숫자를 찾는 문제이다.

순서를 보장해야 한다.

***/
class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        List<Integer> collect = Arrays.stream(nums)
            .map(i -> -i).sorted()
            .limit(k).map(i -> -i).boxed()
            .collect(Collectors.toList());
        
        List<Integer> xx= new ArrayList<>();
        int count = 1;
        for (int n : nums) {
            if (collect.contains(n) && count <= k) {
                count++;
                xx.add(n);
                int i = collect.indexOf(n);
                collect.remove(i);
            }
        }
        return xx.stream().mapToInt(a -> a).toArray();
    }
}