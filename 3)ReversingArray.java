class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int nonzero=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[nonzero++]=arr[i];
            }
        }
        while(nonzero<arr.length){
            arr[nonzero++]=0;
        }
    }
}
