class Solution
{
    public static void sort012(int a[], int n)
    {
        // initialize the count of 0 1 and 2 as 0
        int cz=0;
        int co=0;
        int ct=0;
        
        //count the number of ones , twos and zeros
        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                //increment the zero counter
                cz++;
            }
            else if(a[i]==1){
                //increment the one counter
                co++;
            }
            else{
                //increment the two counter
                ct++;
            }
        }
        int i=0;
        
        //put 0 in array until count of 0 becomes 0
        while(cz>0){
            a[i]=0;
            cz--;
            i++;
        }
        //put 1 in array until count of 1 becomes 0
        while(co>0){
            a[i]=1;
            co--;
            i++;
        }
        
        //put 2 in array until count of 2 becomes 0
        while(ct>0){
            a[i]=2;
            ct--;
            i++;
        }
    }
}
