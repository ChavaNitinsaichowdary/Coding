class Solution {
public:
    
    long long helper(vector<int> &a,vector<int> &b,int i,bool state,vector<vector<long long>>& dp){
        if(i>=a.size())return 0;
        if(dp[i][state]!=-1)return dp[i][state];
        long long ans = 0;
        if(state){
            ans = max(ans,1LL*a[i] + helper(a,b,i+1,state,dp));
            ans = max(ans,1LL*a[i] + helper(a,b,i+2,!state,dp));
        }
        else{
            ans = max(ans,1LL*b[i] + helper(a,b,i+1,state,dp));
            ans = max(ans,1LL*b[i] + helper(a,b,i+2,!state,dp));
        }
        return dp[i][state] = ans;


    }
    long long maxEnergyBoost(vector<int>& energyDrinkA, vector<int>& energyDrinkB) {
        int n = energyDrinkA.size();
        vector<vector<long long>> dp(n,vector<long long>(2,-1));
        return max(helper(energyDrinkA,energyDrinkB,0,0,dp),helper(energyDrinkA,energyDrinkB,0,1,dp));
    }
};