class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalcost=0;
        int totalgas=0;
        for(int i=0;i<gas.length;i++){
            totalcost +=cost[i];
            totalgas += gas[i];
        }
        if(totalcost>totalgas){
            return -1;
        }
        int currentgas=0;
        int startingindx=0;
        for(int i=0;i<gas.length;i++){
            currentgas+=gas[i]-cost[i];
        
        if(currentgas<0){
            startingindx=i+1;
            currentgas=0;
        }
        }
        return startingindx;

    }
}