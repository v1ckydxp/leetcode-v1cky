class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String[] texts = text.split(" ");
        //ArrayList<String> answer = new ArrayList<>();
        String[] answer = new String[texts.length];
        int count = 0;
        int index = 0;
        int flagF = 0;
        int flagS = 0;
        
        while(index < texts.length){
            if(texts[index].equals(first)){
                flagF = 1;
       
            }else if(texts[index].equals(second)){
                flagS = 1;
                if(flagF == 1 && flagS == 1){
                    //answer.add(texts[++index]) ;
                    answer[count++] = texts[++index];
                    //System.out.println(index);
                    flagF = 0;
                    flagS = 0;
                }
                continue;
            }
            index++;
            //System.out.println(index);
                
        }
       // System.out.println(count);
        //return answer.toArray(new String[answer.size()]);
        return Arrays.copyOfRange(answer, 0, count);
    }
}
