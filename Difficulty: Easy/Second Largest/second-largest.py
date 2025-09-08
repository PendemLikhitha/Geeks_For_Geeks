class Solution:
    def getSecondLargest(self, arr):
        s = f = -1
        for i in arr[0:]:
            if i>f:
                s=f
                f=i
            elif i>s and f!=i:
                s=i
        return s
                