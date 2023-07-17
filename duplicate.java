class Solution {
    public int findDuplicate(int[] nums) {
        boolean[] seen = new boolean[nums.length + 1];

        for (int num : nums) {
            if (seen[num]) {
                return num;
            }
            seen[num] = true;
        }

        // If no duplicate is found, you can choose to return -1 or any other appropriate value
        return -1;
    }
}


