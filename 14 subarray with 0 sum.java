class Solution{
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[],int n)
    {
        //Your code here
        int sum=0;
        Set<Integer> hs=new HashSet<>();
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            if(sum==0|| arr[i]==0||hs.contains(sum)){
                return true;
            }
            hs.add(sum);
            
        }
        return false;
    }
}
