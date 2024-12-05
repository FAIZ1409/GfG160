class Solution {
    public void reverse(int start , int end, int arr[]){
        while(start<end){
            int temp = arr[end];
            arr[end]  = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
    }
    public void swap(int start, int end,int arr[]){
        int temp = arr[end];
        arr[end] = arr[start];
        arr[start] = temp;
        
    }
    void nextPermutation(int[] arr) {
        // code here
        int n = arr.length;
        int index = -1;
        for(int i =n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                index =i;
                break;
            }
        }
        
        if(index==-1){
            reverse(0, n-1,arr);
            return;
        }
        
        for(int i = n-1;i>index;i--){
            if(arr[i]>arr[index]){
                swap(i,index,arr);
                break;
            }
            
        }
        reverse(index+1,n-1,arr);
            
            
    }
}
