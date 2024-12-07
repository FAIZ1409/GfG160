class Solution {
    // Function to find maximum product subarray
    int maxProduct(int[] arr) {
   
          // Base case: if the array is empty, return 0
        if (arr.length == 0) return 0;

        // Initialize variables to track the maximum and minimum products
        int maxSoFar = arr[0];
        int minSoFar = arr[0];
        int result = arr[0];

        // Traverse the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            // If the current element is negative, swap max and min
            if (arr[i] < 0) {
                int temp = maxSoFar;
                maxSoFar = minSoFar;
                minSoFar = temp;
            }

            // Update max and min products for the current position
            maxSoFar = Math.max(arr[i], maxSoFar * arr[i]);
            minSoFar = Math.min(arr[i], minSoFar * arr[i]);

            // Update the result to the maximum product encountered so far
            result = Math.max(result, maxSoFar);
        }

        return result;
    }
}
