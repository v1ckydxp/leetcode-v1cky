class Solution {
    public int minDeletionSize(String[] A) {
        int flag = 0;
        int count = 0; 
        for(int j = 0; j < A[0].length() ;j++){
            flag = 0;
            for(int i = 0; i < A.length-1 ;i++){
                if((A[i].charAt(j)-'0') > (A[i+1].charAt(j)-'0')){
                    flag = 1;
                     break;
                }
            }
            if(flag == 1)
                count++;
        }
         return count;   
    }
}
