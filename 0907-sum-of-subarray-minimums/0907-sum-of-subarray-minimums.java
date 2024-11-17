class Solution {
    public int sumSubarrayMins(int[] arr) {
        int []nextsm=nextsmaller(arr);
        int []prevsm=prevsmaller(arr);
        int mod=1000000007;
        long count=0;
        for(int i=0;i<arr.length;i++){
            int first=i-prevsm[i];
            int last=nextsm[i]-i;
            long prod=(first*last)%mod;
            prod=(prod*arr[i])%mod;
            count=(count+prod)%mod;
        }
        return (int)count;
    }
    private int []nextsmaller(int[]arr){
        int []ans=new int [arr.length];
        Stack<Integer>stack=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]){
                stack.pop();
            }
               if(stack.isEmpty()){
                ans[i]=arr.length;
               }  else{
                ans[i]=stack.peek();
               }
               stack.push(i);
        }
        return ans;
    }
    private int []prevsmaller(int[]arr){
        int []ans=new int [arr.length];
        Stack<Integer>stack=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!stack.isEmpty() && arr[stack.peek()]>arr[i]){
                stack.pop();
            }
               if(stack.isEmpty()){
                ans[i]=-1;
               }  else{
                ans[i]=stack.peek();
               }
               stack.push(i);
        }
        return ans;
    }
}