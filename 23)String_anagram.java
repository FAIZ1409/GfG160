class Solution {
    // Function is to check whether two strings are anagram of each other or not.
    public static boolean areAnagrams(String s1, String s2) {

        // Your code here
        String str1=sort(s1);
        String str2=sort(s2);
        return str1.equals(str2);
    }
    private static String sort( String s1){
        char[] arr=s1.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}
