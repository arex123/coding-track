/*
2160. Minimum Sum of Four Digit Number After Splitting Digits
*/

Solution {
    public int minimumSum(int num) {
        int[] arr = new int[4];
        int n = num;
        int i=0;
        while(n>0){
            arr[i]=n%10;
            n=n/10;
            i++;
        }
        Arrays.sort(arr);
        int n1 = arr[0]*10+arr[3];
        int n2 = arr[1]*10+arr[2];
        return n1+n2;
    
        
    }
}