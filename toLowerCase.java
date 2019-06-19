class Solution {
    public String toLowerCase(String str) {
        
        char[] result = str.toCharArray();
        for(int i = 0 ; i < str.length(); i++){
            if(str.charAt(i) <= 90 && str.charAt(i) >=65){
                int num = (int)str.charAt(i);
                num =  num + 32;
                result[i] = (char) num;
            }
        }
        return new String(result);
    }
}
