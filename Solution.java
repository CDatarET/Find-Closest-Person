class Solution {
    public int findClosest(int x, int y, int z) {
        if(Math.abs(z - x) > Math.abs(z - y)){
            return(2);
        }

        if((x + y + z) / 3.0 == z || x == y){
            return(0);
        }

        return(1);
    }
}
