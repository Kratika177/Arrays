
//User function Template for Java

/*
 class Pair  
{  
    long first, second;  
    public Pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
} */

class Compute 
{
    static Pair getMinMax(long a[], long n)  
    {
        //Write your code here
        long min=a[0],max=a[0];
        for(int i=0;i<n;i++){
            min=Math.min(min,a[i]);
            max=Math.max(max,a[i]);
        }
        Pair p=new Pair(min,max);
        return p;
    }
}
