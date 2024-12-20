class Solution {
    // Function to count inversions in the array.
    static int inversionCount(int arr[]) {
        // Your Code Here
        return mergesort(arr,0, arr.length-1);
    }
    static int mergesort(int[] arr,int l,int r){
        if(l>=r){
            return 0;
        }
        int mid=(l+r)/2;
        int li=mergesort(arr,l,mid);
        int ri=mergesort(arr,mid+1,r);
        int m= merge(arr,l,mid,r);
        return li+ri+m;
    }
    static int merge(int[] arr, int l,int mid,int r){
        int j=mid+1;
        int cn=0;
        for(int i=l;i<=mid;i++){
            while(j<=r&&arr[i]>arr[j]){
                j++;
            }
            cn+=j-(mid+1);
        }
        Arrays.sort(arr,l,r+1);
        return cn;
    }
}
