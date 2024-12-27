class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int a1=a.length , b1=b.length,j=0;
        int[] arr=new int[a1+b1];
        for(int i=0;i<a1;i++){
            arr[i]=a[i];
        }
        for(int i=a1;i<a1+b1;i++){
            arr[i]=b[j];
            j++;
        }
        Arrays.sort(arr);
        return arr[k-1];
    }
}
