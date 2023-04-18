import java.util.Scanner;

class maxProductofsubarray{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        System.out.println("max product: "+maxProduct(arr));
    }
    public static int maxProduct(int[] nums){
        int max=nums[0];
        int cmax=nums[0];
        int cmin=nums[0];
        int size = nums.length;
        for(int i=1;i<size;i++){
            int n = nums[i];
            int tmp=cmax*n;
            cmax=Math.max(tmp,Math.max(cmin*n,n));
            cmin=Math.min(tmp,Math.min(cmin*n,n));
            
            max=Math.max(max,cmax);
            
        }
        return max;
    }
    public static int maxProductBruteForce(int[] nums) {
        int max=nums[0];
        int size = nums.length;
        for(int i=0;i<size;i++){
            int tmax=1;
            for(int j=i;j<size;j++){
                tmax*=nums[j];
                max=Math.max(tmax,max);            
            }
            
        }
        return max;
    }
}