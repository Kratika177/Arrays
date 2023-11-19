class Solution {
    void rearrange(int arr[], int n) {
        // code here
        List<Integer> pos=new ArrayList<>();
        List<Integer> neg=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                pos.add(arr[i]);
            }
            else{
                neg.add(arr[i]);
            }
        }
        int p=0,ne=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                if(p<pos.size()){
                    arr[i]=pos.get(p++);
                }
                else{
                    arr[i]=neg.get(ne++);
                }
                
            }
            else{
                if(ne<neg.size()){
                    arr[i]=neg.get(ne++);
                }
                else{
                    arr[i]=pos.get(p++);
                }
                
            }
        }
    }
}
