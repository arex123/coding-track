class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stl = new Stack<>();
        stl.push(0);
        
        int n = heights.length;
        int[] nls = new int[n]; //next left smallest
        nls[0] = stl.peek();
        for(int i=1;i<n;i++){
            
            if(heights[stl.peek()]<heights[i]){
                nls[i]=stl.peek()+1;
            }else{
                while(heights[stl.peek()]>=heights[i]){
                    stl.pop();
                    if(stl.size()==0){
                        nls[i]=0;
                        break;
                    }
                }
                
                if(stl.size()>0){
                    nls[i]=stl.peek()+1;
                }
                
            }
            
            stl.push(i);
        }
        
        
        int[] nrs = new int[n]; //next right smaller
        nrs[n-1] = n-1;
        
        Stack<Integer> str = new Stack<>();
        str.push(n-1);
        for(int i=n-2;i>=0;i--){
            if(heights[str.peek()]<heights[i]){
                nrs[i] = str.peek()-1;
            }else{
                while(heights[str.peek()]>=heights[i]){
                    str.pop();
                    if(str.size()==0){
                        nrs[i]=n-1;
                        break;
                    }
                }
                
                if(str.size()>0){
                    nrs[i] = str.peek()-1;
                }
            }
            str.push(i);
            
        }
        
        
        int[] breadth = new int[n];
        int maxarea = 0;
        for(int i=0;i<n;i++){
            breadth[i] = Math.abs(nrs[i] - nls[i]) + 1;
            
            int area = breadth[i]*heights[i];
            maxarea = Math.max(area,maxarea);
        }
        
        return maxarea;
            
            
            
             
    }
}