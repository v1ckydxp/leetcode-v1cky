class Solution {
    public String removeOuterParentheses(String S) {
        String result = new String();
        int index = 1;
        int numRight = 0;
        int numbLeft = 0;
        for(int i = 0; i < S.length(); i++){
            if(S.charAt(i) == ')')
                numRight ++;
            else if(S.charAt(i) == '(')
                numbLeft++;
            if(numbLeft == 1 && numRight==1){
                numRight = 0;
                numbLeft = 0;
                index = i+2;
            }
            else if(numbLeft == numRight){
                result += S.substring(index,i);
                index = i+2;
                numRight = 0;
                numbLeft = 0;
            }
               
        }
        return result;
    }
}
