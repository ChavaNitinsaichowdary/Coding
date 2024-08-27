class Solution {
public:
    int trap(vector<int>& height) {
        stack<int> s;
        int ans = 0;
        for(int i = 0;i<height.size();i++){
            while(!s.empty() && height[s.top()]<=height[i]){
                int curr = s.top();
                s.pop();
                if(s.empty())break;
                int ht = min(height[s.top()],height[i]);
                int left = ht - height[curr];
                int w = i-s.top()-1;
                ans+=(left*w);
            }
            s.push(i);
        }
        return ans;
    }
};