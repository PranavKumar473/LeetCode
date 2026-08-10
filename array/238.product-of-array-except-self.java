Medium
    
Q.  Given an integer array nums, return an array answer such that 
    answer[i] is equal to the product of all the elements of nums except nums[i].

    The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

     You must write an algorithm that runs in O(n) time and without using the division operation.

Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]

//Code: T.C:O(N), S.C: O(1)
    
class Solution {
    public int[] productExceptSelf(int[] arr) {
        int n = arr.length;
        int Pfpd[] = new int[n];
        
        Pfpd[0] = arr[0];
        for(int i=1;i<n;i++){
          Pfpd[i] = Pfpd[i-1]*arr[i];
        }
        int suffix = 1;
        for(int i= n-1;i>0;i--){
            Pfpd[i] = Pfpd[i-1]*suffix;
            suffix = suffix * arr[i];
        }
        Pfpd[0] = suffix;
        return Pfpd;
    }
}
