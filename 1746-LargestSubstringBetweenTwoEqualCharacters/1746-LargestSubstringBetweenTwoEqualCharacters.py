# Last updated: 11/08/2026, 16:04:28
class Solution:
    def maxLengthBetweenEqualCharacters(self, s: str) -> int:
        result =-1
        for left in range(len(s)):
            for right in range (left+1 , len(s)):
                if s[left] == s[right]:
                    result = max(result,right - left-1)
        return result
