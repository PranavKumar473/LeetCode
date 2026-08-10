Hard

Given n non-negative integers representing an elevation map where the width of each bar is 1, 
compute how much water it can trap after raining.
    
    Example 1:

Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. 
In this case, 6 units of rain water (blue section) are being trapped.

    Example 2:

Input: height = [4,2,0,3,2,5]
Output: 9
 

Constraints:

n == height.length
1 <= n <= 2 * 104
0 <= height[i] <= 105

T.C:O(N), S.C:O(N)

class Solution {

    public int[] Pmax(int[] height){
        int n = height.length;
        int Pfmax[] = new int[n];
         Pfmax[0] = height[0];
        for(int i=1;i<n;i++){
         Pfmax[i]=Math.max(height[i],Pfmax[i-1]);
        }
        return Pfmax;
    }
    public int[] Smax(int[] height){
        int n = height.length;
        int Sfmax[] = new int[n];
         Sfmax[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
         Sfmax[i]=Math.max(height[i],Sfmax[i+1]);
        }
        return Sfmax;
    }

    public int trap(int[] height) {
        int n = height.length;
        int Pfmax[] = Pmax(height);
        int Sfmax[] = Smax(height);
        int amount = 0;
        for(int i=1;i<n-1;i++){
            int leftBlock = Pfmax[i-1];
            int rightBlock = Sfmax[i+1];
            int block = Math.min(leftBlock,rightBlock);
            int contribution = block - height[i];

            if(contribution > 0){
                amount = amount+contribution;
            }
        }
        return amount;
    }
}
