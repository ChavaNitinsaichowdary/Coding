class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int[] prefix = new int[s.length()];
        for(int i = 0;i<n;i++){
            if(i==0) prefix[i] = (s.charAt(i)=='1')? 1 : 0;
            else prefix[i] = prefix[i-1] + ((s.charAt(i)=='1')? 1 : 0);
        }
        int ans = 0;
        for(int i = 0;i<n;i++){
            int count = 0,one = 0;
            for(int j = i;j<n;j++){
                one = prefix[j] - ((i==0)? 0 : prefix[i-1]);
                count = j-i+1-one;
                if(count*count > one) j+=((count*count)-one-1);
                if(count*count <= one){
                    int k = (int)Math.sqrt(one);
                    ans++;
                    if(k>count){
                        ans+=(j+(k-count))>=n ? (n-j-1) : (k-count);
                        j+=(k-count);
                    }
                }
            }
        }
        return ans;
    }
}