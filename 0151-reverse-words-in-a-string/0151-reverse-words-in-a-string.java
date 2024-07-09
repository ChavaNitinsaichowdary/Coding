class Solution {
    public String reverseWords(String s) {
        char[] str = s.toCharArray();
        reverse(str,0,str.length-1);
        each(str);
        return clean(str);
    }
    public String clean(char[] str){
        int i = 0,j=0;
        while(j<str.length){
            while(j<str.length && str[j]==' ')j++;
            while(j<str.length && str[j]!=' ')str[i++] = str[j++];
            while(j<str.length && str[j]==' ')j++;
            if(j<str.length)str[i++] = ' ';
        }
        return new String(str).substring(0,i);
        
    }
    public void each(char[] str){
        int i = 0,j = 0;
        while(j<str.length){
            while(i<str.length && str[i]==' ')i++;
            j = i;
            while(j<str.length && str[j]!=' '){
                j++;
            }
            reverse(str,i,j-1);
            i = j;
        }
       
    }
    public void reverse(char[] str,int k,int l){
            while(k<l){
                char temp = str[k];
                str[k] = str[l];
                str[l] = temp;
                k++;
                l--;
            }
            
    }
}