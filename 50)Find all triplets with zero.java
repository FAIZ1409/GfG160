class Solution {
    public List<List<Integer>> findTriplets(int[] arr) {
        List<List<Integer>> triplets = new ArrayList<>();
        int n = arr.length;

        // Iterate through all possible triplets using three nested loops
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    // Check if the sum of the triplet is zero
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        List<Integer> triplet = new ArrayList<>();
                        triplet.add(i);
                        triplet.add(j);
                        triplet.add(k);
                        triplets.add(triplet);
                    }
                }
            }
        }

        return triplets;
    }
}
