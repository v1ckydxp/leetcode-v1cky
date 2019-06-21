class Solution {
    public int numUniqueEmails(String[] emails) {
        String localName = new String();
        String dominName = new String();
        HashMap<String,String> hashMap = new HashMap();
        for(String email : emails){
            String[] result =  email.split("@");
            dominName = result[1];
            localName = result[0];
            int index = localName.indexOf('+');
            if(index > 0)
                localName = localName.substring(0,index);
            localName = localName.replace(".","");
            email = localName+"@"+dominName;
            if(!hashMap.containsKey(email))
                hashMap.put(email,localName);
        }
        return hashMap.size();
    }
}
