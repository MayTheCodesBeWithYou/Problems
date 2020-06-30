class majorityEle {
public:
    int majorityElement(vector<int>& nums) {
        int len = nums.size();
    if (nums.size() == 0) {
        return -1;
    }
    if (nums.size() == 1) {
        return nums[0];
    }
    
    int me = nums[0];
    
    int count = 0;
    
    
    for(int num: nums){
        if(me == num){
            count++;
        }
        
        else if(count == 0){
            me = num;
            count = 1;
        }
        
        else{
            count--;
            
        }
    }
    
    count = 0;
    
    for(int num : nums){
        if(me == num){
            count++;
        }
        
    }
    
    if(count > len/2){
        return me;
    }
    
    else{
        return -1;
    }
    }
};