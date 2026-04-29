class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
         int i=0;
         int j=1;
         int maxProfits=0;
         while(j<n){
            if(prices[j]-prices[i]>maxProfits){
                maxProfits=prices[j]-prices[i];
            }
            if(prices[j]<prices[i]){
                i=j;
            }
            j++;
         }
         return maxProfits;
    }
}
