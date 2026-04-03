class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        int mid=0;
        while(low< high){
            // if the array is already sorted
            if (nums[low] <= nums[high])
            return nums[low];

            mid= low + (high - low) / 2;
            
            // minimum element is always find in unsorted part of the array
            if(nums[low]<=nums[mid]){
                low=mid+1;
            }
            else{
                high=mid;
            }
        }

        return nums[low];
    }
}
