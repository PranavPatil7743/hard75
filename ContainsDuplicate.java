class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        int n= nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) { // if any two elements are the same, return true
                    return true;
                }
            }
        }
        return false; // if no duplicates are found, return false
    }

    //alternative for big array
    //Arrays.sort(nums);
    //int n= nums.length;
    //for(int i =1; i<n-1; i++){
    //if (nums[i]==nums[j])
    //return true;}return false;
    public static void main(String[] args) {
        ContainsDuplicate solution = new ContainsDuplicate();

        int[] nums1 = {1, 2, 3, 4};
        System.out.println(solution.containsDuplicate(nums1)); // Expected output: false

        int[] nums2 = {1, 2, 3, 1};
        System.out.println(solution.containsDuplicate(nums2)); // Expected output: true

        int[] nums3 = {};
        System.out.println(solution.containsDuplicate(nums3)); // Expected output: false

        int[] nums4 = {1, 1, 1, 1};
        System.out.println(solution.containsDuplicate(nums4)); // Expected output: true
    }
}
