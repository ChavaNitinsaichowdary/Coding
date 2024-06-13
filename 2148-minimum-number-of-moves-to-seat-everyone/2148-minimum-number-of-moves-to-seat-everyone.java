class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int i = 0,j = 0;
        int ans = 0;
        while(i<seats.length && j<students.length){
            ans+=Math.abs(seats[i]-students[j]);
            i++;j++;
        }
        return ans;
    }
}