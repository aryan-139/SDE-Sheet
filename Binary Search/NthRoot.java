public class Solution {
    static int helper(long mid, int n, int m) {
        long ans = 1;
        for (int i = 1; i <= n; i++) {
            ans *= mid;
            if (ans > m) {
                return 2;
            }
        }
        if (ans == m) {
            return 1;
        }
        return 0;
    }

    public static int NthRoot(int n, int m) {
        if (m == 1 || n == 1) {
            return m;
        }

        int low = 1;
        int high = m;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int ans = helper(mid, n, m);

            if (ans == 1) {
                return mid;
            } else if (ans == 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}
