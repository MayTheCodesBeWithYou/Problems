class singleNumBrute
{
	public int singleNumber(int[] nums) {
        int[] count=new int[nums.length];
        int ans=0;
        for(int i=0;i<nums.lenght;i++)
        {
            for(int j=0;j<nums.lenght;j++)
            {
                if(nums[i]==nums[j])
                {
                    count[i]++;
                }
            }
            if(count[i]==1)
            {
                ans=i;
            }
        }
        return nums[ans];
    }
}