class Solution {
    
    public int[] intersection(int[] nums1, int[] nums2) {
      // nums1, nums2 의 중복을 제거한다.  정렬을 실행한다.
        // 크기가 큰 곳부터 쭉 보면서 반환할 값을 찾는다.
        // 반환한다.
        List<Integer> collect = Arrays.stream(nums2).boxed().distinct().collect(Collectors.toList());
        int[] objects = Arrays.stream(nums1).distinct().sorted().filter(i -> {
            return collect.contains(i);
            }).toArray();
        return objects;
    }
    
}
/**
시작 - 7시 14분 -37분 (23분 소요)

잘 안된 부분은 Java8 때문이다. toArray() 하면 int[] objects 로 나오지 않는다.
내 IDE 는 11로 맞쳐져 있어서 이슈 발생

**/