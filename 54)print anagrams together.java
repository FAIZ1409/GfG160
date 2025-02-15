class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for (String word : arr) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedKey = new String(chars);
            map.putIfAbsent(sortedKey, new ArrayList<>());
            map.get(sortedKey).add(word);
        }
        ArrayList<ArrayList<String>> result = new ArrayList<>(map.values());
        result.sort((a, b) -> a.get(0).compareTo(b.get(0)));
        return result;
    }
}
