class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int max = 0;
        for(int index = 0 ; index < A.length ;index++){
            if(A[index] > max)
                max = A[index];
        }
        for(int index = 0 ; index < A.length ;index++){
            if(A[index] == max)
                return index;
        }
           
        return -1;
         
    }
}
 
