
//User function Template for Java
class Solution
{
   
    String reverseWords(String S)
    {
        String word="";
        String ans="";
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)!='.'){
                word=S.charAt(i)+word;
            }
            else{
                ans=ans+word+".";
                word="";
            }
        }
        ans+=word;
        return ans;
    }
}
