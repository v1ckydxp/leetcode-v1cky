class Solution {
    public boolean judgeCircle(String moves) {
       int upAndDown = 0;
       int rightAndLeft = 0;
       for(int i = 0;i < moves.length() ; i++){
           
           if(moves.charAt(i) == 'U'){
               upAndDown++;
           }else if(moves.charAt(i) == 'D'){
               upAndDown--;
           }else if(moves.charAt(i) == 'L'){
               rightAndLeft++;
           }else if(moves.charAt(i) == 'R'){
               rightAndLeft--;
           }
       }
        if(rightAndLeft == 0 && upAndDown == 0)
            return true;
        else
            return false;
    }
}
