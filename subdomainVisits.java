class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String,Integer> hashMap = new HashMap<String,Integer>();
        List<String> list = new ArrayList<String>();
        for(String str: cpdomains){
            String[] temp= str.split(" ");
            int number = Integer.parseInt(temp[0]); 
            if(temp[1].indexOf(".") > 0){
                String[] domains = temp[1].toString().split("\\."); 
                String domain = new String();
                for(int i = domains.length-1; i >= 0;i-- ){
                    domain =i==domains.length-1?domains[i]: domains[i]+"."+domain;
                    
                    if(hashMap.containsKey(domain)){
                        hashMap.put(domain,hashMap.get(domain)+number);
                    }else{
                        hashMap.put(domain,number);
                    }
                    
                }
            }
        }
        
        Iterator iter = hashMap.entrySet().iterator(); 
        while (iter.hasNext()) { 
            Map.Entry entry = (Map.Entry) iter.next(); 
            list.add(entry.getValue().toString()+" "+entry.getKey());
        }
        return list;
    }
}
