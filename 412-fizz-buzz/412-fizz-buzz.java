class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> objects = new ArrayList<>();
    for (int i=1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                objects.add("FizzBuzz");
            } else if (i % 3 == 0) {
                objects.add("Fizz"); 
            } else if (i % 5 == 0) {
                objects.add("Buzz"); 
            } else {
                objects.add(i + "");
            }
        }
        
      return  objects;
    };
}