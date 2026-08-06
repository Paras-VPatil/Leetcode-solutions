class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] onums = new int[2*n] ;
        for(int j=0;j<2*n;j++){
            onums[j]=nums[j];
        }
        for(int i=0;i<n;i++){
            nums[2*i+1]=onums[n+i];
            nums[2*i]=onums[i];
        }
        return nums;

    }
}