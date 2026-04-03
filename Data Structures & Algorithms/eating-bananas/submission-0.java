class Solution {
    public int minEatingSpeed(int[] piles, int h) {
      
    Arrays.sort(piles);
    int n=piles.length;
    int max=piles[n-1];
    int low=1;

    int ans=0;
    while(low <= max){

    int mid=low+(max-low)/2;
    long k=0;
     for(int pile: piles){
        k += Math.ceil((double)pile / mid);
        

    }
    if(k<=h){
        ans=mid;
        max=mid-1;
    }
    else{
        low=mid+1;
    }

    }
      return ans;
    }
}
