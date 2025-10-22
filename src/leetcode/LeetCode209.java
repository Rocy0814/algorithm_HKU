package leetcode;

public class LeetCode209 {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int length = 100000000;
        int sum = 0;
        for(int j = 0; j < nums.length; j++){
            sum += nums[j];
            while(sum >= target){
                length = (j - i + 1) < length ? (j-i+1) : length;
                sum -= nums[i];
                i++;
            }
        }
        return length == 100000000 ? 0 : length;
    }
}
