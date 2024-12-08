class Solution {
    public int minGroups(int[][] intervals) {
        int n=intervals.length;
        int[] start_times=new int[n];
        int[] end_times=new int[n];
        for(int i=0;i<n;i++){
            start_times[i]=intervals[i][0];
            end_times[i]=intervals[i][1];
        }
        Arrays.sort(start_times);
        Arrays.sort(end_times);
        int end=0,gc=0;
        for(int start: start_times){
            if(start>end_times[end]){
                end++;
            }
            else{
                gc++;
            }
        }
        return gc;
    }
}
