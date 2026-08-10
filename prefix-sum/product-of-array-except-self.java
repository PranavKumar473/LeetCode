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