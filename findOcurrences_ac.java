class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String[] texts = text.split(" "); 
        String[] answer = new String[texts.length];
        int count = 0;
        int index = 0;
 
        
        while(index < texts.length-2){
            if(texts[index].equals(first) && texts[index+1].equals(second)){
                answer[count++] = texts[index+2];
       
            } 
            index++;
        } 
        return Arrays.copyOfRange(answer, 0, count);
    }
}
