class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int max = Arrays.stream(A).max().getAsInt();
        for(int index = 0 ; index < A.length ;index++){
            if(A[index] == max)
                return index;
        }
           
        return -1;
         
    }
}
 
