class Solution {

    public int kConcatenationMaxSum(int[] arr, int k) {
        if (k == 1) {
            return Math.max(0, maxSum(arr));
        }
        long totalSum = sum(arr);
        int newarr[] = new int[arr.length * 2];
        for (int i = 0; i < newarr.length; i++) {
            newarr[i] = arr[i % arr.length];
        }
        long ans = maxSum(newarr);
        if (totalSum > 0) {
            ans += (k - 2) * totalSum;
        }
        return (int)(Math.max(0, ans) % 1_000_000_007);
    }
    static long sum(int arr[]) {
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    static int maxSum(int arr[]) {
        int currentSum = arr[0];
        int maxSum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], arr[i] + currentSum);
            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
    }
}