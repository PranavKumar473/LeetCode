//Kadanes Algorithm  T.C: O(N), S.C: O(1)
class Solution {
    public int maxSubArray(int[] arr) {
        int sum = 0;
        int ans = Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++){
        if(sum>=0){
            sum = sum + arr[i];
        }
        else{
            sum = arr[i];
        }
        ans = Math.max(ans,sum);
        }
        return ans;

    }
}
