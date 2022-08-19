class Solution {
    public int maximumWealth(int[][] accounts) {
        int result = 1;        
        for(int i = 0; i < accounts.length; i++){
            int maxium = 0;    
            for(int j = 0; j < accounts[i].length; j++){
                maxium += accounts[i][j];
            }
            
            if (result <= maxium) {
                result = maxium;
            }
        }
        return result;
    }
}