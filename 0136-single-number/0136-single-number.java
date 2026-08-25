class Solution {
    public int singleNumber(int[] nums) {
        /*HashMap<Integer, Integer> map = new HashMap<>();
        
        // Count frequencies
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        // Find the element with frequency 1
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        
        return -1;*/

       /* Arrays.sort(nums);
        for (int i = 1; i < nums.length; i += 2) {
            if (nums[i] != nums[i - 1]) {
                return nums[i - 1];
            }
        }
        return nums[nums.length - 1];*/

        /*int ans = 0;
        for (int num : nums) {
            ans ^= num; // Cumulative XOR
        }
        return ans;*/

        HashSet<Integer> set = new HashSet<>();
        long setSum = 0;
        long arraySum = 0;

        for (int num : nums) {
            if (!set.contains(num)) {
                set.add(num);
                setSum += num;
            }
            arraySum += num;
        }

        return (int) (2 * setSum - arraySum);
    }
}