class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n=weights.length;
        int high=0;
        int low=0;
        for(int i=0;i<n;i++){
            high+=weights[i];
        }
        for(int i=0;i<n;i++){
            if(weights[i]>low){
                low=weights[i];
            }
        }
        int mid=0;
        int ans=high;
        while(low<=high){
            mid=low+(high-low)/2;
            int current=0;
            int currentday=1;
            for(int i=0;i<n;i++){
                
                if(current + weights[i] <= mid){
                  current+=weights[i];
                }
                else{
                    currentday++;
                    current=weights[i];
                }
            }
            if(currentday<=days){
                ans = mid;
                high=mid-1;
            } 
            else{
                low=mid+1;
            }

        }
    return ans;
    }
    
}