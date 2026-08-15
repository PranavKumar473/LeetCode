class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      
        int p = 0;
        int q = 0;

        while(p<(m+n-1) && q<n){
            if(nums1[p]<nums2[q]){
                p++;
            }
            else{
                if(nums1[p]!=0){
                    nums1[p+1] = nums1[p];
                    nums1[p]  =  nums2[q];
                    q++;
                    p++;
                }
                else{
                    nums1[p]  =  nums2[q];
                    q++;
                    p++;
                }
            }    
        }
        for(int i=0;i<nums1.length;i++){
        System.out.print(nums1[i]+",");
        }
    }
}