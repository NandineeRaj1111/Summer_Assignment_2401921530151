class Solution {
    public String longestCommonPrefix(String[] s) {
        if(s==null||s.length==0) return " ";
        Arrays.sort(s);//sorted string array
        String first=s[0];//first word
        String last=s[s.length-1];//last word 
        int i=0;
        while(i<first.length() && i<last.length()&& first.charAt(i)==last.charAt(i)){
            i++;
        } 
        return first.substring(0,i);
        }
}