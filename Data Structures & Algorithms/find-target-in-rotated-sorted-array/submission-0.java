class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int pivot=findmin(nums);

        int left=binarysearch(nums,0,pivot-1,target);
        if(left!=-1) return left;

        return binarysearch(nums,pivot,n-1,target);
        
    }


      private int findmin(int[] nums){
        int low=0;
        int high=nums.length-1;


            while(low< high){
            // if the array is already sorted
            if (nums[low] <= nums[high])
            return low;

           int mid = low + (high - low) / 2;
            
            // minimum element is always find in unsorted part of the array
            if(nums[low]<=nums[mid]){
                low=mid+1;
            }
            else{
                high=mid;
            }
        }

        return low;
      }

      private int binarysearch(int[] nums,int low,int high,int target){
            while(low <=high){
                int mid=low+(high-low)/2;
                if(nums[mid]==target) return mid;

                else if(nums[mid] < target){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        return -1;
    }
}
