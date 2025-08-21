class Solution {
    public static void main(String[] args){
        int [] arr = {2,4,6,8,9,12,13,14,15};
        int target = 6;
        int ans = firstPosition(arr, target);
        System.out.println(ans);
    }
    // Function to find first position
    static int firstPosition(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                ans = mid;     // store answer
                end = mid - 1; // go left
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

}



