class Solution {
    public int minIncrementForUnique(int[] nums) {
        int count [] = new int [100001];
        for(int i:nums){
            count[i]++;
        }
        int moves =0;
        for(int i=0; i<100000;i++){
            if(count[i]>1){
                moves+=(count[i]-1);
                count[i+1]+=(count[i]-1);
            }
        }
        int n=count[100000]-1;
        moves+=(n*(n+1)/2);
        return moves;

    }
}
