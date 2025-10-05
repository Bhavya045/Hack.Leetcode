class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length() ){
            return false;
        }
        StringBuffer d= new StringBuffer();
        d.append(s);
        d.append(s);
        return d.toString().contains(goal);
    }
}