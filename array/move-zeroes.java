class Solution {
    public void moveZeroes(int[] arr) {
        int j=-1;
       for(int i=0;i<arr.length;i++){
        if(arr[i]==0){
            j=i;//update j if arr[i]=0
            break;
        }
       }
       if(j==-1){
        return;
       }
       for(int i=j+1;i<arr.length;i++){
        if(arr[i]!=0){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j]=temp;
            j++;
        }
       }
       for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+",");
       }
    }
}