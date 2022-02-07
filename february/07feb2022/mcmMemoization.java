// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.matrixMultiplication(N, arr));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int matrixMultiplication(int N, int arr[])
    {
        // code here
        Integer[][] mem= new Integer[1001][1001];
        return mcm(arr,1,N-1,mem);
        
    }
    static int mcm(int[] arr , int i,int j,Integer[][] mem){
        if(i>=j) return 0;
        
        if(mem[i][j]!=null) return mem[i][j];
        
        
        int min =Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            int temp = mcm(arr,i,k,mem) + mcm(arr,k+1,j,mem) + arr[i-1]*arr[k]*arr[j];
            
            if(min>temp){
                min=temp;
            }
            
        }
        mem[i][j]= min;
        return min;
        
    }
}