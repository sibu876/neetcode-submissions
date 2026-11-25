class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int ans =0;
        
        for(int num:nums){

            if(!set.contains(num -1)){
            int curr = num;
            int count =1;
            while( curr != Integer.MAX_VALUE && set.contains(curr+1)){
                curr++;
                count++;
            }
            ans = Math.max(count, ans);

            }

        }
        return ans;
    }
}
