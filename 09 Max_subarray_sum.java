class Solution{
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
        long sum=0;
        long maxSum=arr[0];
        for(int i=0;i<n;i++){
                sum=sum+arr[i];  
                maxSum=Math.max(sum,maxSum);
                if(sum<0){
                    sum=0;
                }
        }
        return maxSum;
    }
    
}
