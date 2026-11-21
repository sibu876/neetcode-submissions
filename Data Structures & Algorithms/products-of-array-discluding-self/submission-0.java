class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int maxprod = 1;
        int count = 0;

        for(int i=0;i<n;i++){
              if(nums[i] == 0){
                count++;
                if(count > 1){
                    return new int[n];
                }
                continue;
                
              }
                maxprod *= nums[i];
              
        }
        int[] ans = new int[n];

        for(int i=0;i<n;i++){
            if(count == 1 && nums[i] != 0){
                ans[i] = 0;
            }else if(count==1 && nums[i] == 0){
               ans[i] = maxprod;
            }else{
                ans[i] = maxprod/ nums[i];
            }
        }
        return ans;
    }
}  
