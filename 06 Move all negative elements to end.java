
class Solution {
    
    public void segregateElements(int arr[], int n)
    {
        // Your code goes here
        List<Integer> pos=new ArrayList<>();
        List<Integer>neg=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                pos.add(arr[i]);
            }
            else{
                neg.add(arr[i]);
            }
        }
        int i=0,j=0;
        while(j<pos.size()){
            arr[i++]=pos.get(j++);
        }
        j=0;
        while(j<neg.size()){
            arr[i++]=neg.get(j++);
        }
    }
}
