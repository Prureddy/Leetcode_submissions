class Solution {
    public void reverseString(char[] s) {
        int j=s.length-1;
        int i=0;
        for(i=0; i<s.length/2; i++){
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            j--;
        }
        
    }
}