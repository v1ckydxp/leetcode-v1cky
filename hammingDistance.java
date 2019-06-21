class Solution {
    public int hammingDistance(int x, int y) {
        int result = x^y;
        String dis = Integer.toBinaryString(result);
        int count = 0;
        for(char i : dis.toCharArray()){
            if(i == '1')
               count++; 
        }
        return count;
    }
}
