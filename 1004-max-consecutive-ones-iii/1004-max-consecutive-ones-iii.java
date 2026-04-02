class Solution {
    public int longestOnes(int[] nums, int k) {
        int countZero=0;
        int ans =0;
        int n = nums.length;
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]==0) countZero++;
            while(countZero>k){
                if(nums[i]==0) countZero--;
                i++;
            }
           ans = Math.max(ans,(j-i+1));
        }
        return ans;
    }
}