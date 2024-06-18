import java.util.*;

class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        
        List<int[]> jobs = new ArrayList<>();
        for (int i = 0; i < difficulty.length; i++) {
            jobs.add(new int[]{difficulty[i], profit[i]});
        }
        
        
        jobs.sort((a, b) -> a[0] - b[0]);
        
       
        Arrays.sort(worker);
        
        int ans = 0;
        int maxProfit = 0;
        int jobIndex = 0;
        
        // Iterate through each worker
        for (int ability : worker) {
            // Update the maximum profit for the jobs the worker can handle
            while (jobIndex < jobs.size() && jobs.get(jobIndex)[0] <= ability) {
                maxProfit = Math.max(maxProfit, jobs.get(jobIndex)[1]);
                jobIndex++;
            }
            // Add the maximum profit that the worker can achieve
            ans += maxProfit;
        }
        
        return ans;
    }
}
