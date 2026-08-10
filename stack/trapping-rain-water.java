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