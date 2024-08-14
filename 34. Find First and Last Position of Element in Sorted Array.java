class Solution {
    public int[] searchRange(int[] nums, int target) {
        int i=0;
        int j=nums.length-1;
        int[] x = new int[2];
        x[0] =-1;
        x[1] = -1;
        
        while(i<=j){
             if(nums[i] == target && nums[j] == target){
                x[0] = i;
                x[1] = j;
                break;
                }else{
                   if(nums[i] != target) i++;
                   if(nums[j] != target) j--;
                }
        }
        return x;
        
    }
}
