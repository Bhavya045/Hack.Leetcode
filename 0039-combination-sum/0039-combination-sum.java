class Solution {
    List<List<Integer>> result=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        generatecombinations(candidates,target,0,new ArrayList<Integer>());
        return result;
    }
 void generatecombinations(int[]candidates,int currtarget,int position,List<Integer>currcombination){
   if(currtarget==0){
     result.add(new ArrayList<>(currcombination));
     return;
   }
   if(position==candidates.length){
    return;
   }
   if(candidates[position]<=currtarget){
    currcombination.add(candidates[position]);
    generatecombinations(candidates,currtarget-candidates[position],position,currcombination);
    currcombination.remove(currcombination.size()-1);
   }
    generatecombinations(candidates,currtarget,position+1,currcombination);
    }
}