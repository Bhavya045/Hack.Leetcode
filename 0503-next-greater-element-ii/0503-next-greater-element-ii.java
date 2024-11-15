class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int [] ans=new int[nums.length];
        Stack<Integer> st=new Stack<>();
        for(int i=nums.length*2-2;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=nums[i%nums.length]){
                st.pop();
            }
            if(st.isEmpty()) ans[i%nums.length]=-1;
            else ans[i%nums.length]=st.peek();
            st.push(nums[i%nums.length]);
        }
        return ans;
    }
}