class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int diff=Integer.MAX_VALUE;
        int size=nums.length;
        for(int i=0;i<size && diff!=0;i++)
        {
            int lo=i+1;
            int hi=size-1;
            while(lo<hi)
            {
                int sum=nums[i]+nums[lo]+nums[hi];
                if(Math.abs(target-sum)<Math.abs(diff))
                {
                    diff=target-sum;
                }
                if(sum<target)
                {
                    lo++;
                }
                else
                {
                    hi--;
                }
            }
        }
        return target-diff;
    }
}