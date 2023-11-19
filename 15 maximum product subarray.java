class Solution {
    long maxProduct(int[] arr, int n) {
        long maxp=arr[0];
        long product=1;
        for(int i=0;i<n;i++){
            product=1;
            for(int j=i;j<n;j++){
                product=product*(long)arr[j];
                maxp=Math.max(maxp,product);
            }
        }
        return maxp;
    }
}
