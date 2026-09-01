class Solution {
    public void reverseString(char[] s) {
        int length =s.length ;
        int l = 0;
        int r = length-1;
        
        while (l<r)
        {
            char t = s[l];
            s[l] = s[r];
            s[r] = t;
            l++;
            r--;
        }
        
    }
}