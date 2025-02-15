class Solution {
    public ArrayList<Integer> intersectionWithDuplicates(int[] a, int[] b) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
        boolean alreadyAdded = false;
        for (int k : result) {
                if (k == a[i]) {
                    alreadyAdded = true;
                    break;
                }
            }
          if (!alreadyAdded) {
                for (int j = 0; j < b.length; j++) {
                    if (a[i] == b[j]) {
                        result.add(a[i]);
                        break;
                    }
                }
            }
        }
      return result;
    }
}
