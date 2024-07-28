class Solution {
public:
    int mySqrt(int x) {
        int s = 0,e = x,ans = -1;
        while(s<=e){
            int m = s + (e-s)/2;
            if((long long)m*m <= x){
                ans = m;
                s = m+1;
            }
            else{
                e = m-1;
            }
        }
        return ans;
    }
};