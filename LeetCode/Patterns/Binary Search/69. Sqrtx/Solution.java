class Solution {
    public int mySqrt(int x) {
        int diff = Integer.MAX_VALUE;
        int sqrt=0;
        for(int i=1;i<=x/2;i++){
            if (x/i==i){
                sqrt=i;
                break;
            }
            else{
                int q=x/i;
                if(q>i && diff>q-i){
                    diff=q-i;
                    sqrt=i;
                }
            }
        }return sqrt;

    }
}