class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        int div = 1;
        List<Integer> count = new ArrayList<Integer>();
        for(int num = left ; num <= right; num ++){
            int flag = 0;
             for(char c : String.valueOf(num).toCharArray()){
                 if(c == '0' || num%(c-'0') != 0 ){
                     flag = 1;
                     break;
                 }
                     
            }
            if(flag == 0)
                count.add(num);
        }
        return count;
    }
}
