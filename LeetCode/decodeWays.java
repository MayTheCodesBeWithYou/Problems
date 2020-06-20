class decodeWays {
    public int numDecodings(String s) {
        int dp[]=new int[s.length()+1];
        dp[0]=1;
        dp[1]=(s.charAt(0)=='0')?0:1;
        
        for(int i=2;i<=s.length();i++)
        {
            //int singleDigit=(s.charAt(i-1)-'0'); //'6'-'0'=6
            int singleDigit=Integer.valueOf(s.substring(i-1,i));
            //int twoDigit=(s.charAt(i-2)-'0')*10+singleDigit; //2*10+6=26
            int twoDigit=Integer.valueOf(s.substring(i-2,i));
            if(singleDigit>=1)
            {
                dp[i]+=dp[i-1];
            }
            if(twoDigit>=10 && twoDigit<=26)
            {
                dp[i]+=dp[i-2];
            }
            
        }
        return dp[s.length()];
    }
}