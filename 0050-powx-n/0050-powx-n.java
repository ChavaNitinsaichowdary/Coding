class Solution {
    public double myPow(double x, int n) {
        if(n<0) return (double)(1/pow(x,-1*n));
        return pow(x,n);
        
    }
    public double pow(double x,long n){
        if(n==0)return (double)1;
        double ans = pow(x,(n/2));
        if(n%2==0){
            return ans * ans;
        }
        else{
            return ans * ans * x;
        }
    }
}