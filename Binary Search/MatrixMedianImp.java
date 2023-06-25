import java.util.ArrayList;

public class Solution {
    public int findMedian(ArrayList<ArrayList<Integer>> A) {
        int row = A.size();
        int col = A.get(0).size();
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        // Find the minimum and maximum values in the matrix
        for (int i = 0; i < row; i++) {
            min = Math.min(min, A.get(i).get(0));
            max = Math.max(max, A.get(i).get(col - 1));
        }
        
        int desired = (row * col + 1) / 2; // Position of the desired median element
        
        while (min < max) {
            int mid = min + (max - min) / 2;
            int count = 0; // Count of elements less than or equal to the mid
            
            // Count the number of elements less than or equal to the mid in each row
            for (int i = 0; i < row; i++) {
                count += countLessOrEqual(A.get(i), mid);
            }
            
            if (count < desired) {
                min = mid + 1;
            } else {
                max = mid;
            }
        }
        
        return min;
    }
    
    private int countLessOrEqual(ArrayList<Integer> row, int target) {
        int low = 0;
        int high = row.size() - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (row.get(mid) <= target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return low;
    }
}
