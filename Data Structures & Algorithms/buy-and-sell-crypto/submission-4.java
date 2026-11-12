class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int r = l+1;
        int mp = 0;
        int le = prices.length; 
        while(r<le){
            
            if(prices[l]>prices[r]){
               l=r;
            }
            else {
                mp=Math.max(mp,(prices[r]- prices[l]));
            }
        r++;}
    return mp;}
}
