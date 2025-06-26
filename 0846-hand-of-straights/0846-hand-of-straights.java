class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length%groupSize!=0){
            return false;
        }
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<hand.length;i++){
            map.put(hand[i],map.getOrDefault(hand[i],0)+1);
        }
        //while(map.size()>0){
           // int currentcard=map.entrySet().iterator().next().getKey();

            for(int carde:hand){
                if(!map.containsKey(carde)){
                    continue;
                }
                int  currentcard=carde;
                while(map.containsKey( currentcard-1)){
                     currentcard--;
                }
              for(int i=0;i<groupSize;i++){
               // currentcard+i, currentcard+i, currentcard+i,
               int card= currentcard+i;
               if(!map.containsKey(card)) return false;
               map.put(card,map.get(card)-1);
               if(map.get(card)==0){
                map.remove(card);
                  }
               }
            }
        
        return true;
    }
}