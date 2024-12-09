class Solution:
    def addBinary(self, s1, s2):
        a = int(s1,2)
        b = int(s2,2)
        r = a+b
        return bin(r)[2:]
