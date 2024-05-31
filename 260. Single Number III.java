class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for(int i : nums){
            xor^=i;
        }
        int mask = xor&(-xor);
        int xor1=0, xor2=0;
        for(int i : nums){
            if((mask&i)==0){
                xor1^=i;
            }else{
                xor2^=i;
            }
        }
        return new int []{xor1, xor2};
    }
}
