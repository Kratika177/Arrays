class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
        List<Long> hs=new ArrayList<>();
        for(int i=0;i<n;i++){
            hs.add(a1[i]);
        }
        int k=0;
        for(int j=0;j<m;j++){
            if(!hs.contains(a2[j])){
                return "No";
            }
            else{
                hs.set(hs.indexOf(a2[j]),(long)-1);
            }
            
        }
        return "Yes";
    }
}
