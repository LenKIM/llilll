class Solution {
    
    public int[] intersection(int[] nums1, int[] nums2) {
      // nums1, nums2 의 중복을 제거한다.  정렬을 실행한다.
        // 크기가 큰 곳부터 쭉 보면서 반환할 값을 찾는다.
        // 반환한다.
        List<Integer> collect = Arrays.stream(nums2).boxed().distinct().collect(Collectors.toList());
        int[] objects = Arrays.stream(nums1).distinct().sorted().filter(i -> {
            return collect.contains(i);
            }).toArray();
        
        int [] result = new int[objects.length];
        for (int i = 0; i < objects.length; i++) {
            
            result[i] = (int) objects[i];
        }
        return objects;
    }
    
}
/**
시작 - 7시 14분

**/