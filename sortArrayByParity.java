class Solution {
    public int[] sortArrayByParity(int[] A) {
        int begin = 0;
        int tail = A.length-1;
        while(begin <= tail){
            
            if(A[begin]%2 == 0){
                begin++;
            }else if(A[tail]%2 != 0){
                tail--;
            }else if(A[begin]%2 != 0 &&A[tail]%2 == 0 ){
                int tmp = A[begin];
                A[begin] = A[tail];
                A[tail] = tmp;
                begin++;
                tail--;
            }
        }
        return A;
    }
}
