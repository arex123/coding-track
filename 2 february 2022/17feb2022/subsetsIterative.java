class Solution {
    // https://leetcode.com/problems/subsets/

    public List<List<Integer>> subsets(int[] nums) {
        /*
         * 
         * subset==subsequence?
         * 
         * Subarray = n*(n+1)/2
         * Subseqeunce = (2^n) -1 (non-empty subsequences)
         * Subset = 2^n (as compare to subseque. it has an empty subset)
         */

        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList()); // isme ek khali place kar diya
        /*
         * [ [] ], ab niche is kali mai ek baar element daalenge
         * or ek baar nahi
         */

        /*
         * jaise pahla element 2 aaya to isko ek baar put kiya or ek baaar nahi
         * to hame mila [[] , [2]],
         * 
         * or subset ka formula bhi hota h ki
         * agar ek element h array mai to uske 2^(no.of element)
         * ->to ek element ka 2^1 = 2 subset bana
         * 
         * waise hi agar do element huye array mai jaise
         * 
         * [2,3]
         * 
         * to iske total subset banenge 2^2 = 4, kasie? aise
         * 
         * 2 tak ke hamare subset ye the- [ [],[2] ] ab isme ek baar 3 daalenge
         * or fir ek baar 3 nahi daalenge jaise
         * [ [], [2] ] //3 nahi dala
         * [ [3], [2,3] ] // 3 dal gya
         * 
         * ==> to total 4 subset ban gaye [ [],[2],[3],[2,3] ];
         * 
         * 
         * 
         * 
         */

        /*
         * Time complexity(TC): O(n*2^n) , n is the number of element in array nums bahar
         * wala loop n times chalega or andar wala 2^n times kyon kyonki s size of
         * subset h
         * or total subset 2^n ho sakta h
         * 
         * 
         * Space Complexity(SC): O(2^n*n) 
         *  if  nums = [ 1, 2, 3]
         *  SC will be, 
         *      total number of subset 2^3 = 8
         *      max element inside susbet  = 3
         *      total SC = 24
         *  [ [],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3] ] where is 24 storage ???
         *                              
         * total number of subset jo ki hum store kar rahe h wo 2^n h or usme hum uske
         * andar at max n number of element le rahe h.
         * 
         * 
         */
        for (int n : nums) {
            int s = ans.size();
            for (int i = 0; i < s; i++) {
                List<Integer> sub = new ArrayList(ans.get(i));
                sub.add(n);
                ans.add(sub);
            }
        }
        return ans;
    }
}