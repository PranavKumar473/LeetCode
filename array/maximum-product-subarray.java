class Solution {
    public int maxProduct(int[] arr) {
        int product = 1;
        int answer = Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++){
        if(product > 0 || product<0 && arr[i]>0){
        product = product*arr[i];
        }
        else{
            product = arr[i];
        }
        answer = Math.max(answer,product);
        }
        return answer;
    }
}