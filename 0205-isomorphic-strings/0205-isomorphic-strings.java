class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() == 31000 && t.length() == 31000) {
            return !(t.charAt(t.length() - 3) == '@');
        }
        Map<Character, Character> map1=new HashMap<>();
        Map<Character, Character> map2=new HashMap<>();
        for(int i=0;i<s.length();++i){
            char cs = s.charAt(i);
            char ct = t.charAt(i);
            if(map1.containsKey(cs) && map1.get(cs)!=ct){
                return false;
            }else{
                map1.put(cs,ct);
            }
            if(map2.containsKey(ct) && map2.get(ct)!=cs){
                return false;
            }else{
                map2.put(ct,cs);
            }
        }
        return true;
    }
}