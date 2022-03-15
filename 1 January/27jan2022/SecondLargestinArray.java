public class SecondLargestinArray {
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = scn.nextInt();
            }
        
            System.out.println("max product: "+print2largest(arr,n));
            
        }
    public static int print2largest(int A[],int N) 
        {
            //CODE HERE
            int max = Integer.MIN_VALUE;
            int min= Integer.MIN_VALUE;
            for(int i=0;i<N;i++){
                if(A[i]>max){
                min=max;
                max=A[i];
                }else if(A[i]>min && A[i]<max)
                min = A[i];
                
            }
            if(min==Integer.MIN_VALUE) 
            min=-1;
            return min;
        }
}

/*abstract

Approach 1: The idea is to sort the array in descending order and then return the second element which is not equal to the largest element from the sorted array.
Complexity Analysis:

Time Complexity: O(n log n). 
Time required to sort the array is O(n log n).
Auxiliary space: O(1). 
As no extra space is required.

Approach 2: The approach is to traverse the array twice. 

In the first traversal find the maximum element. 

In the second traversal find the greatest element in the remaining excluding the previous greatest.

Complexity Analysis:

Time Complexity: O(n). 
Two traversals of the array is needed.
Auxiliary space: O(1). 
As no extra space is required.



Efficient Solution 
Approach: Find the second largest element in a single traversal. 
Below is the complete algorithm for doing this:  

1) Initialize the first as 0(i.e, index of arr[0] element
2) Start traversing the array from array[1],
   a) If the current element in array say arr[i] is greater
      than first. Then update first and second as,
      second = first
      first = arr[i]
   b) If the current element is in between first and second,
      then update second to store the value of current variable as
      second = arr[i]
3) Return the value stored in second.

Complexity Analysis:

Time Complexity: O(n). 
Only one traversal of the array is needed.
Auxiliary space: O(1). 
As no extra space is required.



*/