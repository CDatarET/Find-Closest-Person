class Solution:
    def findClosest(self, x: int, y: int, z: int) -> int:
        if abs(z - x) > abs(z - y):
            return 2

        if (x + y + z) / 3 == z or x == y:
            return 0

        return 1
