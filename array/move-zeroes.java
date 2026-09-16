class Solution {
    public void moveZeroes(int[] arr) {
        int[] temp = new int[arr.length];
        int k = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                temp[k] = arr[i];
                k++;
            }
        }
        for(int i=0;i<temp.length;i++){
            arr[i] = temp[i];
        }
        int nz = temp.length;
        for(int i=nz;i<arr.length;i++){
            arr[i]=0;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }
}