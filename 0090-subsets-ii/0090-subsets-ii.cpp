class Solution {
public:
    void helper(vector<int>& nums,vector<int> v,vector<vector<int>>& ans,int index){
        if(index == nums.size()){
            if(find(ans.begin(),ans.end(),v)==ans.end()){
                ans.push_back(v);
            }
            return;
        }
        helper(nums,v,ans,index+1);
        v.push_back(nums[index]);
        helper(nums,v,ans,index+1);
    }
    vector<vector<int>> subsetsWithDup(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        vector<int> v;
        vector<vector<int>> ans;
        helper(nums,v,ans,0);
        return ans;
    }
};