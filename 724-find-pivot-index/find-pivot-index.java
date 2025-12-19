class Solution {
    //srijanya
    public int pivotIndex(int[] nums) {
        int rightSum=0;
        for(int val:nums)
        {
            rightSum +=val;
        }
        int leftSum=0;
        for(int i=0;i<nums.length;i++)
        {
            int val=nums[i];
            rightSum-=val;
            if (leftSum==rightSum)
            {
                return i;
            }
        leftSum+=val;
        }
        return -1;
    }
}