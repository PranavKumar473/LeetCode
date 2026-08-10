class Solution {
    static int[] prefixSum(int[] arr){
	int n = arr.length;
	int Pf[] = new int[n];
	Pf[0] = arr[0];
	for(int i=1;i<n;i++){
	Pf[i] = Pf[i-1]+arr[i];
	}
	return Pf;
   }
    public int pivotIndex(int[] arr) {
		int n = arr.length;
		int[] Pf = prefixSum(arr);
		int ans=0;
		for(int i=0;i<n;i++){
			int leftsum = (i==0)? 0: Pf[i-1];
			int rightsum = Pf[n-1]-Pf[i];
			if(leftsum == rightsum){
				System.out.println(i);
				return i;
			}
		}
		return -1;
	}
    
}