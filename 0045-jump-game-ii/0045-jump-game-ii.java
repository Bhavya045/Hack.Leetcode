class Solution {
    public int jump(int[] nums) {
        int totaljumps=0;
        int lastjumpidx=0,coverage=0;
        int finaldest=nums.length-1;
        if(nums.length==1){
            return 0;
        }
        for(int i=0;i<nums.length;i++){
            coverage =Math.max(coverage,i+nums[i]);
            if(i==lastjumpidx){
                lastjumpidx=coverage;
                totaljumps++;
                 if(coverage >=finaldest){
                return totaljumps;
            }
            }
           
        }
        return totaljumps;
    }
}