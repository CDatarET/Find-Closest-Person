public class Solution {
    public int FindClosest(int x, int y, int z) {
        if(Math.Abs(z - x) > Math.Abs(z - y)) return 2;
        if((x + y + z) / 3.0 == z || x == y) return 0;
        return 1;
    }
}
