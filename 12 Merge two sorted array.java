
class Solution
{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        int i=0,j=0,k=0;
        long[] arr3=new long[n+m];
        while(i<=n-1 && j<=m-1){
            if(arr2[j]<arr1[i]){
                
                arr3[k++]=arr2[j++];
            }
            else{
                arr3[k++]=arr1[i++];
            }
        }
        if(i<=n-1){
            while(i<=n-1){
                arr3[k++]=arr1[i++];
            }
        }
        if(j<=m-1){
            while(j<=m-1){
                arr3[k++]=arr2[j++];
            }
        }
        int l=0;
        for(l=0;l<n;l++){
            arr1[l]=arr3[l];
        }
        int o=0;
        for(o=0;o<m;o++){
            arr2[o]=arr3[l++];
        }
    }
}
