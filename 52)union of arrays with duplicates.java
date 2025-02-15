class Solution {
    public static int findUnion(int a[], int b[]) {
        HashSet<Integer> unionSet = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            unionSet.add(a[i]);
        }

        for (int j = 0; j < b.length; j++) {
            unionSet.add(b[j]);
        }

        return unionSet.size();
    }
}
