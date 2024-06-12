class Solution {
    public void sortColors(int[] nums) {
        int i = 0,j = nums.length-1,k= 0;
        while(k<=j){
            if(nums[k]==0){
                if(k!=i){
                    int temp = nums[k];
                    nums[k] = nums[i];
                    nums[i] = temp;
                }
                else{
                    k++;
                } 
                i++; 
            }
            else if(nums[k]==2){
                if(k!=j){
                    int temp = nums[k];
                    nums[k] = nums[j];
                    nums[j] = temp;
                }
                else{
                    k++;
                }
                j--;
            }
            else{
                k++;
            }
        }
    }
}