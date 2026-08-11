class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x; 
        int diff = Integer.MAX_VALUE;
        int sqrt = 0;

        for (int i = 1; i <= x / 2; i++) {
            int q = x / i;
            if (q == i) {
                return i;
            } else if (q > i) {
                if (diff > q - i) {
                    diff = q - i;
                    sqrt = i;
                }
            } else {
                break; 
            }
        }
        return sqrt;

    }
}