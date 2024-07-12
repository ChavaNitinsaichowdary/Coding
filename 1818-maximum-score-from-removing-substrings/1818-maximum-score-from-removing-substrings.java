class Solution {
    public int maximumGain(String s, int x, int y) {
        Stack<Character> st = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        int ans = 0;
        if(y>=x){
            for(int i = 0;i<s.length();i++){
                char ch = s.charAt(i);
                if(ch=='a'){
                    if(!st.isEmpty() && st.peek()=='b' && y>=x){
                        st.pop();
                        ans+=y;
                    }
                    else{
                        st.push(ch);
                    }
                }
                else {
                    st.push(ch);
                }
            }
            while(!st.isEmpty()){
                char ch = st.pop();
                if(!st2.isEmpty() && st2.peek()=='b' && ch=='a'){
                    ans+=x;
                    st2.pop();
                }
                else{
                    st2.push(ch);
                }
            }
        }
        else if(x>y){
            for(int i = 0;i<s.length();i++){
                char ch = s.charAt(i);
                if(ch=='b'){
                    if(!st.isEmpty() && st.peek()=='a' && x>y){
                        st.pop();
                        ans+=x;
                    }
                    else{
                        st.push(ch);
                    }
                }
                else {
                    st.push(ch);
                }
            }
            while(!st.isEmpty()){
                char ch = st.pop();
                if(!st2.isEmpty() && st2.peek()=='a' && ch=='b'){
                    ans+=y;
                    st2.pop();
                }
                else{
                    st2.push(ch);
                }
            }
        }
        
       
        return ans;
    }  
}