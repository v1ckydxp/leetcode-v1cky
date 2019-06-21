class Solution {
    
    public int[] diStringMatch(String S) {
        int len = S.length();
        int[] array = new int[len+1];
        int low = 0;
        int high = len; //low <=high
        for(int i=0 ; i < S.length(); i++ ){
            if(S.charAt(i) == 'I')
                 array[i] = low++;
            else if(S.charAt(i) == 'D')
                 array[i] = high--;
        }
        array[len] = low;
         
      
        return array;
    }
 
}
