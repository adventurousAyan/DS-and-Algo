class Solution:
    """Given a string s, return the length longest palindromic substring in s.
    Input: s = "babad"
    Output: 3
    """
    def longestPalindrome(self, s: str) -> str:
        
        s1 = s
        s2 = s[::-1]
        print(s1)
        print(s2)
        m = len(s1)
        n = len(s2)
        rows, cols = (m+1, n+1)
        t = [[-1]*cols]*rows
        
        return self.lps(s1, s2, m, n, t)
    
    
    def lps(self, s1, s2, m, n, t):
        maxLength = 0
        for i in range(0, m+1):
            for j in range(0, n+1):
                if i ==0 or j == 0:
                    t[i][j] = 0
        
        for i in range(1, m+1):
            for j in range(1, n+1):
                if s1[i-1] == s2[j-1]:
                    t[i][j] = 1+t[i-1][j-1]
                else:
                    t[i][j]= max(t[i-1][j],t[i][j-1])
        
        maxLength = max(maxLength,t[i][j])
        return maxLength
                
        
   
            
            
        