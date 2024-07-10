class Solution {
    public int minOperations(String[] logs) {
        int op = 0;
        for(String log : logs){
            if(log.charAt(0)=='.' && log.charAt(1)=='.'){
                if(op>0)op--;
            }
            else if(log.charAt(0)=='.' && log.charAt(1)=='/'){

            }
            else{
                op++;
            }
        }
        return op;
    }
    
}