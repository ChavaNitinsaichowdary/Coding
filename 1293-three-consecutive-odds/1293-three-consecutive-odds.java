class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int o = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]%2!=0){
                o++;
            }
            else{
                o = 0;
            }
            if(o==3){
                return true;
            }
        }
        return false;
    }
}