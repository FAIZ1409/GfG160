class Solution {
    int getMinDiff(int[] arr, int k) {
        int n=arr.length;
        Arrays.sort(arr);
        int result=arr[n-1]-arr[0];
        for(int i=1;i<n;i++){
            int max=Math.max(arr[i-1]+k,arr[n-1]-k);
            int min=Math.min(arr[0]+k,arr[i]-k);
            
            if(min<0) continue;
                result=Math.min(result,max-min);
            
        }
        return result ;
        
        // code here
    }
}
