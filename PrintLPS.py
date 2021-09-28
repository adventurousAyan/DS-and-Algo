class Solution:
    def longestPalindrome(self, s: str) -> str:
        
        s1 = s
        s2 = s[::-1]
        m = len(s1)
        n = len(s2)
        t = [[None]*(n+1) for i in range(m+1)]
        return self.lps(s1, s2, m, n,t)
    
    
    def lps(self, s1, s2, m, n,t):
        sr = []
        for i in range(m+1):
            for j in range(n+1):
                if i ==0 or j == 0:
                    t[i][j] = 0
                elif s1[i-1] == s2[j-1]:
                    t[i][j] = 1+t[i-1][j-1]
                else:
                    t[i][j]= max(t[i-1][j],t[i][j-1])
       
        while m >0 and n > 0:
            if s1[m-1] == s2[n-1]:
                sr.append(s1[m-1])
                m = m - 1
                n = n-1                
            else:
                if t[m][n-1]> t[m-1][n]:
                    n = n-1
                else:
                    m = m-1
        return ''.join([str(x) for x in sr])
        
        
         
                
                
        
   
            
            
        