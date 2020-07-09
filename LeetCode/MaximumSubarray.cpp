class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int curr_max = 0;
        int max_fa = INT_MIN;
        // check for all negative case
        for(int i =0;i<nums.size();i++){
            max_fa = max(max_fa,nums[i]);
        }
        if(max_fa>=0){
        for(int i =0;i<nums.size();i++){
            curr_max = curr_max + nums[i];
            if(curr_max<0){
                curr_max = 0;
            }
            if(curr_max>max_fa){
                max_fa = curr_max;
            }
        }
        }
        return max_fa;
           
    }
};
