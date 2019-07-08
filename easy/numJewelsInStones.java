class Solution {
    public int numJewelsInStones(String J, String S) {
        int lenOfS = S.length();
        int count = 0; 
        for(int j = 0; j < lenOfS; j++){
            
            if( (J.indexOf(S.charAt(j)) ) != -1 )
            {
                count++;
            }
        }
        return count;
    }
}
