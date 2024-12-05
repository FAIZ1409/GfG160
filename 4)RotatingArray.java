class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        int n = arr.length;
        d = d % n;
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<d; i++) {
            list.add(arr[i]);
        }
        
        int i = 0;
        for(i=0; i<n-d; i++) {
            arr[i] = arr[i+d];
        }
        
        for(int j=0; j<list.size(); j++) {
            arr[i] = list.get(j);
            i++;
        }
    }
}
