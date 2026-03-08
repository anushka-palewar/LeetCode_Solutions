class Solution {
    public int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            max = Math.max(max, num);
        }

        return max;
    }

    public int smallestDivisor(int[] arr, int threshold) {
        int low = 1;
        int high = findMax(arr);

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int calSum = divSum(arr, mid);

            if (calSum <= threshold)
                high = mid - 1;
            else
                low = mid + 1;
        }

        return low;
    }

    public int divSum(int[] arr, int div) {
        int sum = 0;
        for (int num : arr) {
            sum += (num + div - 1) / div;
        }

        return sum;
    }
}