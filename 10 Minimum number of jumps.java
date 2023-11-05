class Solution{
    static int minJumps(int[] arr){
        // your code here
        int c=0;
        int des=0;
        int pos=0;
        for(int i=0;i<arr.length-1;i++){
            des=Math.max(des,i+arr[i]);

            if(pos==i){
                pos=des;
                c++;
            }
        }
        if(pos>=arr.length-1){
            return c;
        }
        return -1;
    }
}
