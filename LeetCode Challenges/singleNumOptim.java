class singleNumOptim {
    public int singleNumber(int[] nums) {
        int ans=0;
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                int count=map.get(nums[i]);
                map.put(nums[i],++count);
            }else
            {
                map.put(nums[i],1);
            }
        }
        Set<Integer> set=map.keySet();
        Iterator<Integer> iterator=set.iterator();
        while(iterator.hasNext())
        {
            int key=iterator.next();
            if(map.get(key)==1)
            {
                ans=key;
            }
        }
        return ans;
    }
}
