class Solution {
    public int repeatedNTimes(int[] A) {
        HashMap<Integer,Integer> hashMap = new HashMap();
        int max = 0;
        int key=0;
        int count = 0;
        for(int n:A){
            if(hashMap.containsKey(n)){
                count = hashMap.get(n);
                hashMap.put(n,count+1);
                if(max < count+1){
                    max = count + 1;
                    key = n;
                }
            }else{
                hashMap.put(n,1);
            }
        }
        return key;
    }
}
