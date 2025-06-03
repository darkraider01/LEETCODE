import java.util.*;

public class LT560 {
    public static int findAllSubarraysWithGivenSum(int[] arr, int k) {
        int n = arr.length;
        Map<Integer, Integer> mpp = new HashMap<>();
        int preSum = 0, cnt = 0;

        // Initialize with prefix sum 0 (important for subarrays starting at index 0)
        mpp.put(0, 1);

        for (int i = 0; i < n; i++) {
            preSum += arr[i];

            int remove = preSum - k;

            // Check how many times 'remove' appeared as a prefix sum
            cnt += mpp.getOrDefault(remove, 0);

            // Store/update the current prefix sum in the map
            mpp.put(preSum, mpp.getOrDefault(preSum, 0) + 1);
        }

        return cnt;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4}; // Example array
        int k = 6;                // Target sum
        int cnt = findAllSubarraysWithGivenSum(arr, k);
        System.out.println("The number of subarrays is: " + cnt);
    }
}
