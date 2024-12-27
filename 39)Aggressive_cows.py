class Solution:

    def aggressiveCows(self, stalls, k):
         # Sort stalls in ascending order
        stalls.sort()
        
        def canPlaceCows(distance):
            count = 1  # Place the first cow in the first stall
            last_position = stalls[0]
            
            for i in range(1, len(stalls)):
                if stalls[i] - last_position >= distance:
                    count += 1
                    last_position = stalls[i]
                    if count == k:  # All cows placed successfully
                        return True
            return False
        
        # Binary search for the largest minimum distance
        low, high = 1, stalls[-1] - stalls[0]
        result = 0
        
        while low <= high:
            mid = (low + high) // 2
            if canPlaceCows(mid):
                result = mid  # Update result with a valid distance
                low = mid + 1
            else:
                high = mid - 1
        
        return result
