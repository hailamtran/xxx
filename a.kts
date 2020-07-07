class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int sum = 1;
        int st = 0;
        int ans = 0;
        int cnt = 0;
        for(int i=0; i<nums.length; i++) {
            sum = sum * nums[i];
            if(sum<k) {
                ans = ans + cnt;
                cnt++;
            }

            while(sum>k) {
                sum = sum / nums[st];
                st++;
                cnt = 1;
            }
        }

        return sum;


    }
}
