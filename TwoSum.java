import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // Create a map to store the numbers and their indices
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i <= nums.length; i++) {
            // Calculate the complement of the current number
            int result = target - nums[i];
            // If the complement is found in the map, return the indices
            if (numsMap.containsKey(result)) {
                return new int[]{(numsMap.get(result)), i};
            }
            // Otherwise, add the number and its index to the map
            numsMap.put(nums[i], i);
        }
        throw new IllegalArgumentException();
    }

    public static void main(String[] args) {
        TwoSum solution = new TwoSum();
        // Test the algorithm with example inputs
        int[] result1 = solution.twoSum(new int[]{2, 15, 11, 7}, 9);
        // Output the results
        System.out.println("Output: [" + result1[0] + ", " + result1[1] + "]"); // Output: [0, 3]

        int[] result2 = solution.twoSum(new int[]{3, 1, 4, 8, 5}, 9);
        System.out.println("Output: [" + result2[0] + ", " + result2[1] + "]"); // Output: [2, 4]

        int[] result3 = solution.twoSum(new int[]{10, 20, 30, 40, 50}, 90);
        System.out.println("Output: [" + result3[0] + ", " + result3[1] + "]"); // Output: [3, 4]
    }
}

//HOW?-
//Now, let's consider the array nums = {2, 7, 11, 15} and the target 9.
//
//First iteration (i = 0):
//
//Current number: 2
//Complement: target - nums[0] = 9 - 2 = 7
//The numMap is empty, so we add (2, 0) to the map.
//Second iteration (i = 1):
//
//Current number: 7
//Complement: target - nums[1] = 9 - 7 = 2
//The numMap already contains 2 as a key. So, the condition numMap.containsKey(complement) is true, meaning we found a pair.
//The return statement then does the following:
//  numMap.get(complement) retrieves the index associated with the complement, which is 0.
//  i is the index of the current number, which is 1.
//So, the return statement returns an array {0, 1}, representing the indices of the two numbers that add up to the target.
// So, the return statement is essentially saying, "I found a solution, and here are the indices of the two numbers
// in the array that satisfy the condition." It returns these indices in the form of a new integer array.
//  The specific format new int[]{numMap.get(complement), i} is just a concise way to create an array with two elements.
