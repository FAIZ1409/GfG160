class Solution {

    public int longestConsecutive(int[] arr) {

        Arrays.sort(arr); 
        int maxLength = 1, currentLength = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                
                continue;
            } else if (arr[i] == arr[i - 1] + 1) {
        
                currentLength++;
            } else {
    
                maxLength = Math.max(maxLength, currentLength);
                currentLength = 1;
            }
        }


        maxLength = Math.max(maxLength, currentLength);
        return maxLength;
    }
}
