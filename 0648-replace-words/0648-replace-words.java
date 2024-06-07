class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        HashSet<String> h = new HashSet<>();
        for(String s : dictionary){
            h.add(s);
        }
        StringBuilder ans = new StringBuilder();
        int n = sentence.length();
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<n;i++){
            char ch = sentence.charAt(i);
            if(ch==' '){
                int j = 0;
                boolean found = false;
                while(j<sb.length()){
                    String str = new String(sb.substring(0,j));
                    if(h.contains(str)){
                        ans.append(str);
                        ans.append(" ");
                        found = true;
                        break;
                    }
                    j++;
                }
                if(!found){
                    ans.append(sb);
                    ans.append(" ");
                }
                sb.delete(0,sb.length());
            }
            else{
                sb.append(ch);
            }
        }
        int j = 0;
                boolean found = false;
                while(j<sb.length()){
                    String str = new String(sb.substring(0,j));
                    if(h.contains(str)){
                        ans.append(str);
                        found = true;
                        break;
                    }
                    j++;
                }
                if(!found){
                    ans.append(sb);
                }
        return ans.toString();
    }
}