class Solution {
    public String multiply(String num1, String num2) {
        char[]s1=reverse(num1);
        char[]s2=reverse(num2);
        int[]res=new int [s1.length+s2.length];
        for(int i=0;i<s1.length;i++){
            int start=i;
            int carry=0;
           for(int j=0;j<s2.length;j++){
                   int n1=s1[i]-'0';
                   int n2=s2[j]-'0';
                   int sum=(n1*n2)+res[start]+carry;
                   carry=sum/10;
                  int base=sum%10;
                   res[start++]=base;
            }
            if(carry!=0) res[start]=carry;
        }
        int i=res.length-1;
        while(i>0 && res[i]==0){
            i--;
        } 
        String ans="";
        while(i>=0){
            ans+=res[i--];
        }
        return ans;

    }
    private char[]reverse(String num){
        char[]ans=num.toCharArray();
        int start=0;
       int end=num.length()-1;
        while(start<end){
            char k=ans[start];
            ans[start]=ans[end];
            ans[end]=k;
            start++;
            end--;
        }
        return ans;

    }
}