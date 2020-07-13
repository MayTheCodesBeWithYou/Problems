class Solution {
    public int maxProduct(int[] nums) {
        if(nums == null || nums.length == 0){ return 0;}
        if(nums.length == 1) return nums[0];
		
        int maxProduct = 0, currProduct = 1;
        for(int i = 0; i < nums.length; i++){
            currProduct *= nums[i];
            maxProduct = Math.max(maxProduct, currProduct);
            if(currProduct == 0) currProduct = 1;
        }
		
        currProduct = 1;
        for(int i = nums.length - 1; i >= 0; i--) {
            currProduct *= nums[i];
            maxProduct = Math.max(maxProduct, currProduct);
            if(currProduct == 0) currProduct = 1;
        }
        return maxProduct;
    }
}