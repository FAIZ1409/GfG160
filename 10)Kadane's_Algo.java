class Solution{
    int maxSubarraySum(int[] arr) {

        // Your code here
        int ans=arr[0],curr=arr[0];
        for(int i=1;i<arr.length;i++){
            curr=Math.max(curr+arr[i],arr[i]);
            ans=Math.max(ans,curr);
        }
        return ans;
    }
}
