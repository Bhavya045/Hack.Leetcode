class Solution {
    List <List<Integer>>res =new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        findsubsets(nums,0,new ArrayList<>());
        return res; 
    }
    public void findsubsets(int nums[],int i,List<Integer>sublist){
        if(i==nums.length){
            res.add(new ArrayList<>(sublist));
            return;
        }
        sublist.add(nums[i]);
        findsubsets(nums,i+1,sublist);
        sublist.remove(sublist.size()-1);
        findsubsets(nums,i+1,sublist);
    }
}