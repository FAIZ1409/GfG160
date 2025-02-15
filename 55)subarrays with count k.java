class Solution {
    public int countSubarrays(int arr[], int k) {
        // code here
        
        int sum=0, count=0;
        HashMap<Integer, Integer> prefix = new HashMap<>();
        prefix.put(0,1);
        for(int num: arr){
            sum+=num;
            if(prefix.containsKey(sum-k)){
                count+=prefix.get(sum-k);
            }
            prefix.put(sum,prefix.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
