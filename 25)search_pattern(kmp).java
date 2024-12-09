class Solution {

    ArrayList<Integer> search(String pat, String txt) {
        // your code here
        ArrayList<Integer> res=new ArrayList();
        int[] lps = new int[pat.length()];
        calculateLPS(pat, lps);
        int j=0, f=0, i=0;
        int N = txt.length();
        while(i<N){
            if(pat.charAt(j)==txt.charAt(i)){
                i++;
                j++;
            }
            if(j==pat.length()){
                f++;
                res.add(i-j);
                j=lps[j-1];
            }
            else if(i<N&& pat.charAt(j)!=txt.charAt(i)){
                if(j!=0){
                    j=lps[j-1];
                }
                else 
                    i=i+1;
            }
        }
        return res;
    }
    void calculateLPS(String pat, int[] lps){
        int N = pat.length();
        int len=0,i=1;
        while(i<N){
            if(pat.charAt(i)==pat.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }
            else {
                if(len!=0){
                    len=lps[len-1];
                }
                else {
                    lps[i]=0;
                    i++;
                }
            }
        }
    }
}
