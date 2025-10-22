package leetcode;

public class LeetCode704 {
    /**
     * 左闭右闭区间定义
     * @param nums
     * @param target
     * @return
     */
    public int search1(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(nums[mid] > target){
                right = mid - 1;
            }
            else if(nums[mid] < target){
                left = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    /**
     * 左闭右开区间定义
     * @param nums
     * @param target
     * @return
     */
    public int search2(int[] nums, int target) {
        // 左闭右开
        int left = 0;
        int right = nums.length;
        while(left < right){
            int mid = (left + right) / 2;
            if(nums[mid] > target){
                right = mid;
            }
            else if(nums[mid] < target){
                left = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
