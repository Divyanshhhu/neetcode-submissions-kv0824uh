class Solution {
    public int[] getConcatenation(int[] nums) {
       int n=nums.length;

       int[] ans=new int[2*n];

       int m=ans.length;
        int j=0;
       for(int i=0;i<m;i++){
        if(i==n){
            j=0;
            ans[i]=nums[j];
            j++;
        }
        else{
            ans[i]=nums[j];
            j++;
        }
       }
        return ans;
    }
}