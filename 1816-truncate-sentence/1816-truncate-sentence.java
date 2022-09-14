class Solution {
    public String truncateSentence(String s, int k) {
        
        
        String[] splitt = s.split(" ");
        List<String> list = new ArrayList<>();
        for(int i=0; i <= k-1; i++){
            list.add(splitt[i]);
        }
        
        return String.join(" ", list);
    }
}