public class Solution {
    public static int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int leftMax = Integer.MIN_VALUE;
        int rightMax = Integer.MIN_VALUE;
        int result = 0;

        while (left < right) {
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);
            result += (leftMax < rightMax) ? leftMax - height[left++] : rightMax - height[right--];
        }
        return result;
    }
}
