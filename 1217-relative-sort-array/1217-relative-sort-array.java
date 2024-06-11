class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] ans = new int[arr1.length];
        int[] cnt = new int[1001];
        for(int num : arr1){
            cnt[num]++;
        }
        int i = 0;
        for(int num : arr2){
            while(cnt[num]-->0){
                ans[i] = num;
                i++;
            }
        }
        for(int j = 0;j<=1000;j++){
            while(cnt[j]-->0){
                ans[i] = j;
                i++;
            }
        }
        return ans;
    }
}