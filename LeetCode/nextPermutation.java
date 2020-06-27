class nextPermutation {
    public void nextPermutation(int[] nums) {
        int k = nums.length-2;
        while(k>=0 && nums[k]>=nums[k+1]){
            k--;
        }
        //Lowest Possible Order
        if(k==-1)
        {
            reverse(nums,0,nums.length-1);
            return;
        }
        for(int j=nums.length-1;j>k;j--)
        {
            if(nums[k]<nums[j])
            {
                int temp=nums[k];
                nums[k]=nums[j];
                nums[j]=temp;
                break;
            }
        }
        reverse(nums,k+1,nums.length-1);
    }
    private void reverse(int[] nums,int start,int end)
    {
        while(start<end)
        {
            int temp=nums[start];
            nums[start++]=nums[end];
            nums[end--]=temp;
        }
    }
}