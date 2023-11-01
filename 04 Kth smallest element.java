//User function Template for Java

class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        for(int i=l;i<=r;i++){
            pq.offer(arr[i]);
            if(pq.size()>k){
              pq.poll();  
            }
        }
        return pq.peek();
    } 
}
