class Solution {
    public double averageWaitingTime(int[][] customers) {
        long finishTime = 0;
        long totalWaitingTime = 0;

        for (int[] customer : customers) {
            int arrivalTime = customer[0];
            int processingTime = customer[1];
            
            if (finishTime < arrivalTime) {
                finishTime = arrivalTime;
            }
            finishTime += processingTime;
            totalWaitingTime += finishTime - arrivalTime;
        }

        return (double) totalWaitingTime / customers.length;
    }
}
