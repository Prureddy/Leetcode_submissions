class Solution {
  public boolean checkIfPangram(String s) {
    int mask = 0;
    
    for(int i = 0; i != s.length();) mask |= 1<<(s.charAt(i++)-'a');    
    
    return mask == 67108863;
  }
}