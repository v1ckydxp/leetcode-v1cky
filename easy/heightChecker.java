class Solution {
    public int heightChecker(int[] heights) {
        int[] increseHeights = new int[heights.length];
        for(int i = 0; i < heights.length; i++){
            increseHeights[i] = heights[i];
        }
        Arrays.sort(increseHeights);
        int count = 0;
        for(int i = 0; i < heights.length; i++){
            if(increseHeights[i] != heights[i])
                count++;
        }
        return count;
    }
}
