class Solution {
    public int maxProfit(int[] prices) {
        int bp=Integer.MAX_VALUE; // bp=minimumPrice
        //mp = maxProfit
        int mp = 0;
        for(int price:prices){
            if(price<bp){
                bp=price;
            }
            if(price-bp>mp){
                mp = price-bp;
            }
        }
        return mp;
      


    }
}
