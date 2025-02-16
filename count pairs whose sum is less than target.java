class Solution {
    int countPairs(int arr[], int target) {
        Arrays.sort(arr);
        int i = 0; 
        int j = arr.length-1;
        int count = 0; 
        while(i<j){
            int sum = arr[i]+arr[j]; 
            if(sum<target){
                count+=(j-i); 
                i++; 
            }else{
                j--; 
            }
        }
        return count;
    }
}
