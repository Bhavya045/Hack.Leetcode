class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null || strs.length==0){
            return new ArrayList<>();
        }
        Map<String,List<String>>hm=new HashMap<>();
        for( String str:strs){
        String fs= getfrequencystring(str);
        if(hm.containsKey(fs)){
            hm.get(fs).add(str);
        }
        else{
            List<String> strlist=new ArrayList<>();
            strlist.add(str);
            hm.put(fs,strlist);
        }
        }
        return new ArrayList<>(hm.values());
    }
    private String getfrequencystring(String str){
        int[]freq=new int[26];
        for(char c:str.toCharArray()){
            freq[c-'a']++;
        }
        StringBuilder frequencystring=new StringBuilder("");
        char c='a';
        for(int i:freq){
            frequencystring.append(c);
             frequencystring.append(i);
             c++;
        }
        return frequencystring.toString();
    }
}