class Solution {
    public static int FindMax(int [] piles){
        int maxi = Integer.MIN_VALUE;
        int n = piles.length;
        for(int i = 0;i<n;i++){
            maxi = Math.max(maxi,piles[i]);
        }
        return maxi;
    }
    public static int calculatehrs(int[]piles,int hrs){
        int totalH = 0;
        for(int i = 0; i<piles.length;i++){
            totalH += Math.ceil((double)(piles[i])/(double)(hrs));
        }
        return totalH;
    }
    public int minEatingSpeed(int[] piles, int h) {
        
        int low = 1;
        int high = FindMax(piles);
        while(low <= high){
            int mid = (low + high)/2;
            int totalH = calculatehrs(piles, mid);
            if(totalH <= h){
                high = mid -1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
}