
class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        String word="";
        String ans="";
        for(int i=S.length()-1;i>=0;i--){
            
            if(S.charAt(i)!='.'){
                word=S.charAt(i)+word;
            }
            else{
                ans=ans+word+".";
                word="";
            }
        }
        ans=ans+word;
        return ans;
    }
}
