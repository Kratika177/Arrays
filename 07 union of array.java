class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        //Your code here
        Set<Integer> union=new TreeSet<>();
        for(int i=0;i<n;i++){
            union.add(a[i]);
        }
        for(int i=0;i<m;i++){
            union.add(b[i]);
        }
        return union.size();
    }
}
