class Solution {
    public List<Integer> sumClosest(int[] arr, int target) {
        if (arr == null || arr.length < 2) {
            return new ArrayList<>(); 
        }

        Arrays.sort(arr); 
        List<Integer> result = new ArrayList<>();
        int closestDiff = Integer.MAX_VALUE;
        int maxAbsDifference = Integer.MIN_VALUE;

        int left = 0, right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];
            int currentDiff = Math.abs(target - sum);

            if (currentDiff < closestDiff || 
               (currentDiff == closestDiff && Math.abs(arr[right] - arr[left]) > maxAbsDifference)) {
                closestDiff = currentDiff;
                maxAbsDifference = Math.abs(arr[right] - arr[left]);
                result = Arrays.asList(arr[left], arr[right]);
            }

            if (sum < target) {
                left++; 
            } else {
                right--; 
            }
        }

        return result;
    }

    
}
