/*Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

A subarray is a contiguous non-empty sequence of elements within an array.

 

Example 1:

Input: nums = [1,1,1], k = 2
Output: 2
Example 2:

Input: nums = [1,2,3], k = 3
Output: 2
 

Constraints:

1 <= nums.length <= 2 * 104
-1000 <= nums[i] <= 1000
-107 <= k <= 107 
*/
public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
      
        int[] prefixSum = new int[nums.length + 1];
        prefixSum[0] = 0;
        for (int i = 1; i <= nums.length; i++)
            prefixSum[i] = prefixSum[i - 1] + nums[i - 1];
      
        for (int start = 0; start < prefixSum.length; start++) {
            for (int end = start + 1; end < prefixSum.length; end++) {
                if (prefixSum[end] - prefixSum[start] == k)
                    count++;
            }
        }
      
        return count;
    }
}