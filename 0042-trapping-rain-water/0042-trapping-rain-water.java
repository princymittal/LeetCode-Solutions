class Solution {
    public int trap(int[] height) {
        int N = height.length;
        int[] left = new int[N], right = new int[N];
        left[0] = height[0];
        right[N-1] = height[N-1];
        for(int i = 1; i < N; i++) {
            left[i] = Math.max(left[i-1], height[i]);
            int j = N - i - 1;
            right[j] = Math.max(right[j+1], height[j]);
        }
        int trappedWater = 0;
        for(int i = 0; i < N; i++) {
            trappedWater+= Math.min(left[i], right[i]) - height[i];
        }
        return trappedWater;
    }
}