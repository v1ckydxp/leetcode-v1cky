class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morseDecode = new String[100];
        String[] morseCode = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashMap<String,String> hashMap = new HashMap<>();
        int index = 0;
        int count = 0;
        for(int i = 0; i < words.length;i++){
            for(int j = 0; j < words[i].length();j++){
                index = (int)words[i].charAt(j)-97;
                morseDecode[i] += morseCode[index];
            }
            hashMap.put(morseDecode[i],words[i]);
        }
        
        return hashMap.size();
    }
}
