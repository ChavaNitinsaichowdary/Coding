class Solution {
    public boolean judgeSquareSum(int c) {

        int lim = (int)(Math.sqrt(c));
        for(int i = 0;i<=lim;i++){
            long curr = c - (long) i*i;
            if(curr>=0 && check(curr))return true;
        }
        return false;
    }
    public boolean check(long curr){
        if(curr<=1)return true;
        long start = 1,end = curr;
        while(start<=end){
            long mid = start + (end-start)/2;
            if(mid*mid == curr){
                return true;
            }
            else if(mid*mid < curr){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return false;

        
    }
}