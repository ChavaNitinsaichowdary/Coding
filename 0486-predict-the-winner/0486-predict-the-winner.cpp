class Solution {
public:
    static bool helper(int i,int j,vector<int>& nums,int s1,int s2,bool flag){
        if (i > j) {
            return s1 >= s2;
        }
        if (flag) {
            return helper(i + 1, j, nums, s1 + nums[i], s2, !flag) || helper(i, j - 1, nums, s1 + nums[j], s2, !flag);
        } else {
            return helper(i + 1, j, nums, s1, s2 + nums[i], !flag) && helper(i, j - 1, nums, s1, s2 + nums[j], !flag);
        }
        
    }
    bool predictTheWinner(vector<int>& nums) {
       return helper(0,nums.size()-1,nums,0,0,true);
    }
};