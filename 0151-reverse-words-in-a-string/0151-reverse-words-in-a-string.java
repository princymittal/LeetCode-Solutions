class Solution {
    public String reverseWords(String s) {
        String rev[]
            = s.trim().split("\\s+");
        String ans = "";
        for (int i = rev.length - 1; i >= 0; i--) {
            ans += rev[i] + " ";
        }
         
        
          return  ans.substring(0, ans.length() - 1);
    }
}
        
    
