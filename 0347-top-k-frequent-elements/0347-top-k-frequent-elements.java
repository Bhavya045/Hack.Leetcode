class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[]bucket=new List[nums.length+1];
        Map<Integer,Integer>hm=new HashMap<>();
        for(int n:nums){
            hm.put(n,hm.getOrDefault(n,0)+1);
        }
        for(int key:hm.keySet()){
            int frequency=hm.get(key);
            if(bucket[frequency]==null){
                bucket[frequency]=new ArrayList<>();
            }
            bucket[frequency].add(key);
        }
        int []res=new int[k];
        int counter=0;
        for(int pos=bucket.length-1;pos>=0 && counter<k;pos--){
            if(bucket[pos]!=null){
                for(Integer integer:bucket[pos]){
                    res[counter++]=integer;
                }
            }
        }
        return res;
    }
}