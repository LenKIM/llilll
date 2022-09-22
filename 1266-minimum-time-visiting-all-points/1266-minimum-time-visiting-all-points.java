/**
1시간 투자했는데, 못풀었다가 잠시 셨다가 다시 풀었더니 풀렸다.
억울하게도, 단지 거리만 구하는 쉬운 문제였음에도 어렵게 생각했다.

**/
class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int result = 0;
        for(int i=0; i < points.length-1; i++) {
            
            int[] begin = points[i];
            int[] end = points[i+1];
            
            int xBegin = begin[0];
            int yBegin = begin[1];
            
            int xEnd = end[0];
            int yEnd = end[1];
            
            int a = Math.abs(xBegin - xEnd);
            int b = Math.abs(yBegin - yEnd);
                        
            result = result + Math.max(a,b);
                
            
        }
        return result;
    }
}