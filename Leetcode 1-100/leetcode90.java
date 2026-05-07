class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        backtrack(0, nums, new ArrayList<>(), res);
        return res;
    }

    void backtrack(int i, int[] nums, List<Integer> curr, 
                   List<List<Integer>> res) {
        res.add(new ArrayList<>(curr));

        for (int j = i; j < nums.length; j++) {
            if (j > i && nums[j] == nums[j - 1]) continue;

            curr.add(nums[j]);
            backtrack(j + 1, nums, curr, res);
            curr.remove(curr.size() - 1);
        }
    }
}