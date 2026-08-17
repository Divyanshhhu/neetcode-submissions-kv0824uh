class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int prod=1;
        int[] pref=new int[n];
        for(int i=0;i<n;i++){
                prod*=nums[i];
                pref[i]=prod;
        }

        int[] suff=new int[n];
        prod=1;
        for(int i=n-1;i>=0;i--){
            prod*=nums[i];
            suff[i]=prod;
        }
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            if(i==0) res[i]=suff[1];
            else if(i==n-1)res[i]=pref[i-1];
            else
            res[i]=pref[i-1]*suff[i+1];
        }
        return res;
    }
}  
