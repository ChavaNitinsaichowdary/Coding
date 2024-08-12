class Solution {
public:
    vector<int> helper(int start,int end,string& expression){
        if(end-start+1<=2)return {stoi(expression.substr(start,end-start+1))};
        vector<int> subans;
        for(int i = start;i<=end;i++){
            if(expression[i]=='+' || expression[i]=='-' || expression[i]=='*'){
                vector<int> leftVal = helper(start,i-1,expression);
                vector<int> rightVal = helper(i+1,end,expression);
                for(int& left : leftVal){
                    for(int& right : rightVal){
                        if(expression[i]=='+')subans.push_back(left+right);
                        if(expression[i]=='-')subans.push_back(left-right);
                        if(expression[i]=='*')subans.push_back(left*right);
                    }
                }
            }
        }
        return subans;
    }
    vector<int> diffWaysToCompute(string expression) {
        return helper(0,expression.length()-1,expression);
    }
};