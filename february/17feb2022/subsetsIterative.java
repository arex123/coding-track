class Solution {
    // https://leetcode.com/problems/subsets/
    
    public List<List<Integer>> subsets(int[] nums) {
         /*

        subset==subsequence?

        Subarray = n*(n+1)/2
        Subseqeunce = (2^n) -1 (non-empty subsequences)
        Subset = 2^n  (as compare to subseque. it has an empty subset)
        */
        
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList()); //isme ek khali place kar diya
        /* [ [] ], ab niche is kali mai ek baar element daalenge 
           or ek baar nahi 
        */
        
        /*
        jaise pahla element 2 aaya to isko ek baar put kiya or ek baaar nahi
        to hame mila [[] , [2]],
        
        or subset ka formula bhi hota h ki 
        agar ek element h array mai to uske 2^(no.of element)
        ->to ek element ka 2^1 = 2 subset bana
        
        waise hi agar do element huye array mai jaise 
        
        [2,3]
        
        to iske total subset banenge 2^2 = 4, kasie? aise
        
        2 tak ke hamare subset ye the- [ [],[2] ] ab isme ek baar 3 daalenge
        or fir ek baar 3 nahi daalenge jaise
            [ [], [2] ] //3 nahi dala
            [ [3], [2,3] ]  // 3 dal gya
            
            ==> to total 4 subset ban gaye [ [],[2],[3],[2,3] ];
        
        
        
        
        */
        
        
        for(int n:nums){
            int s=ans.size();
            for(int i=0;i<s;i++){
                List<Integer> sub = new ArrayList(ans.get(i));
                sub.add(n);
                ans.add(sub);
            }
        }
        return ans;
    }
}