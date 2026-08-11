T.C: O(N) , S.C:O(1)
//Solution 1 

class Solution {
    public int maxProduct(int[] nums) {
        int maxProd = nums[0];
        int minProd = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];

            // If current element is negative, max becomes min and min becomes max
            if (curr < 0) {
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }

            // Standard Kadane choice: take current element alone OR multiply with running product
            maxProd = Math.max(curr, maxProd * curr);
            minProd = Math.min(curr, minProd * curr);

            // Update global result
            result = Math.max(result, maxProd);
        }

        return result;
    }
}

-------------------------------------------------------------------
//Solution 2

    
class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int maxProduct = Integer.MIN_VALUE;
        int prefix = 1;
        int suffix = 1;

        for (int i = 0; i < n; i++) {
            // Reset running products if we hit 0
            if (prefix == 0) prefix = 1;
            if (suffix == 0) suffix = 1;

            prefix *= nums[i];          // Product from left to right
            suffix *= nums[n - 1 - i];  // Product from right to left

            maxProduct = Math.max(maxProduct, Math.max(prefix, suffix));
        }

        return maxProduct;
    }
}




