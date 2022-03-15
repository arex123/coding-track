// https://leetcode.com/problems/count-all-valid-pickup-and-delivery-options/
class Solution {
    public int countOrders(int n) {
        int mod = (int)Math.pow(10,9)+7;
        long last = 1; //this arrangement/answer is for 1 order
        /*
        step 1: find spaces in previous combination if n=2 then find spaces in previous order m=1 p1d1 (first pickup then deliver)
                    _p1_d1_, total 3 places where we can add our new order 
                    
                    (i-1)*2+1;
                    
        step 2: 
        */
        for(int i=2;i<=n;i++){
            int spaces = (i-1)*2+1;
            /*
                    Pickup needs to be before Delivery.
                    Consider one of the valid cases for 2 pickups and 2 deliveries:

                    P1 P2 D1 D2.

                    Now lets Try to place P3 D3 within the above sequence:

                    Since we have 4 parts to this ( 2 pickups & 2 deliveries) we can insert (P3D3) at any of the below 5 spaces:

                    __ P1 __ P2 __ D1 __ D2 __

                    If we place (P3 D3) at space 1 : we can have five combinations: 5
                    If we place (P3 D3) at space 2 : we can have four combinations: 4
                    If we place (P3 D3) at space 3 : we can have three combinations: 3
                    If we place (P3 D3) at space 4 : we can have two combinations: 2
                    If we place (P3 D3) at space 5 : we can have two combinations: 1

                    Total (5+4+3+2+1) = 15 => (5*(5+1)/2).. sum from 1 to n is (n*(n+1)/2);

                    Since with 2 pickups and 2 deliveries we can have 6 combinations, hence adding (P3D3) will result in :
                    (15*6) = 90 combinations.
            */
            long val = spaces*(spaces+1)/2;
            last = (last*val)%mod;
        }
        
        return (int)last;
        
    }
}