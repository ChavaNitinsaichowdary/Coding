class Solution {
    public String reverseParentheses(String s) {
        int n = s.length();
        char[] str = s.toCharArray();
        Stack<Integer> st = new Stack<>();
        for(int i = 0;i<n;i++){
            char ch = str[i];
            if(ch=='('){
                st.push(i);
            }
            else if(ch==')'){
                int index = st.pop();
                reverse(str,index+1,i-1);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char ch : str){
            if(ch!='(' && ch!=')'){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public void reverse(char[] str,int i,int j){
        while(i<j){
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }
    }
}