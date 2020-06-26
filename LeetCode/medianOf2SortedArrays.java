class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int []merged=new int[nums1.length+nums2.length];
        int size=merged.length;
        for(int i=0;i<nums1.length;i++)
        {
            merged[i]=nums1[i];
        }
        for(int i=0;i<nums2.length;i++)
        {
            merged[i+nums1.length]=nums2[i];
        }
        Arrays.sort(merged);
        if(size % 2 == 0)
        {
            int sum=merged[(size-1)/2]+merged[size/2];
            return Double.valueOf(sum/2.0);
        }
        return (double)merged[size/2];
    }
}