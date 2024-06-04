class Solution {
    public int longestPalindrome(String s) {
        int[] cnta = new int[26];
        int[] cntA = new int[26];
        int ans = 0;
        for(int i = 0;i<s.length();i++){
            int t = s.charAt(i)-'a';
            if(t>=0 && t<26){
                cnta[t]++;
            }
            else{
                cntA[s.charAt(i)-'A']++;
            }
        }
        boolean hasOdd = false;
        for(int i = 0;i<26;i++){
            if(cnta[i]!=0 && cnta[i]%2==0){
                ans+=cnta[i];
            }
            else if(cnta[i]!=0){
                ans+=(cnta[i]-1);
                hasOdd = true;
            }
             if(cntA[i]!=0 && cntA[i]%2==0){
                ans+=cntA[i];
            }
            else if(cntA[i]!=0){
                ans+=(cntA[i]-1);
                hasOdd = true;
            }
        }
        if(hasOdd)ans++;
        return ans;
    }
}