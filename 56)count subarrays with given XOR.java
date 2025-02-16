class Solution {
    public long subarrayXor(int arr[], int k) {
        // code here
        long ans=0;
        Map<Integer,Integer> mp = new HashMap();
        int cur=0;
        mp.put(0,1);
        for(int i: arr){
            cur=cur^i;
            if(mp.containsKey(cur^k))
                ans+=mp.get(cur^k);
            mp.put(cur,mp.getOrDefault(cur,0)+1);
        }
        return ans;
    }
}
