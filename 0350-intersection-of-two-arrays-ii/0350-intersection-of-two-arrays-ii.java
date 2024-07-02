class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> ls = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0,j = 0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                ls.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]>nums2[j]){
                j++;
            }
            else{
                i++;
            }
        }
        int[] arr = new int[ls.size()];
        for(i = 0;i<arr.length;i++){
            arr[i] = ls.get(i);
        }
        return arr;
    }
}