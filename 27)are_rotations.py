class Solution:
    def areRotations(self,s1,s2):
        s1+=s1
        if s2 in s1:
            return True
        else:
            return False
