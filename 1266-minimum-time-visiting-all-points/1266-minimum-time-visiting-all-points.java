/**
11:40
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
            
//             if(xBegin == xEnd) {
//                 result = result + Math.abs(yBegin-yEnd);
//                 continue;
//             }
            
//             if(yBegin == yEnd) {
//                 result = result + Math.abs(xBegin-xEnd);
//                 continue;
//             }
            
            int a = Math.abs(xBegin - xEnd);
            int b = Math.abs(yBegin - yEnd);
                        
            result = result + Math.max(a,b);
                
            
        }
        return result;
    }
}