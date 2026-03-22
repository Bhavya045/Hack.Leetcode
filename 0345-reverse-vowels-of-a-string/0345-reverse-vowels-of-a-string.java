class Solution {
    public String reverseVowels(String s) {
         int start=0;
         int end=s.length()-1;
         char[] ch= s.toCharArray();
         while(start<end){
              if(!isvowel(ch[start])){
                start++;
              }else if(!isvowel(ch[end])){
                end--;
              }else{
                char temp=ch[start];
                ch[start]=ch[end];
                ch[end]=temp;
                start++;
                end--;

              }
         }
         return String.valueOf(ch);

     }  
    
      public  static boolean isvowel(char ch){

            if(ch =='a' || ch =='A' || ch=='e'|| ch=='E' || ch=='I' ||ch=='i' || ch=='O' ||  
                  ch=='o' || ch=='U'|| ch=='u'){
                return true;
            }
              return false;
         }
    
}