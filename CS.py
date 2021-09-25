class CS:

    def cs(self, arr, target):
        n = len(arr)
        ans = []
        temp = []
        return self.comb_sum(arr, target, n, temp, ans)

    def comb_sum(self, arr, target, n, temp, ans):
        if n == 0 or target == -1:
            return
        if target == 0:
            ans.append(list(temp))
        elif arr[n-1] <= target:
            temp.append(arr[n-1])
            self.comb_sum(arr, target-arr[n-1], n , temp, ans)  
            temp.remove(arr[n-1]) 
            self.comb_sum(arr, target, n-1, temp, ans)  
        elif arr[n-1] > target:
            self.comb_sum(arr, target, n-1, temp, ans)
       
        return ans
       



cs = CS()
ls = [2,3,6,7]
print(cs.cs(ls, 7))
