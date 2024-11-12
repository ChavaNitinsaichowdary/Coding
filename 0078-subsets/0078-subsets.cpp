class Solution {
public:
    vector<vector<int>> helper(vector<int>& nums,vector<int> v,int index){
        if(index==nums.size()){
            vector<vector<int>> sub;
            sub.push_back(v);
            return sub;
        }
        vector<vector<int>> ans;
        vector<vector<int>> ns = helper(nums,v,index+1);
        v.push_back(nums[index]);
        vector<vector<int>> s = helper(nums,v,index+1);
        v.pop_back();
        for(vector<int> t : ns){
            ans.push_back(t);
        }
        for(vector<int> t : s){
            ans.push_back(t);
        }
        return ans;
    }
    vector<vector<int>> subsets(vector<int>& nums) {
        vector<int> v;
        return helper(nums,v,0);
    }
};