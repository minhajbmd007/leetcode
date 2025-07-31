class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] rez = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {

            int indexInNums2 = -1;
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == nums1[i]) {
                    indexInNums2 = j;
                    break;
                }
            }

            int nextGreater = -1;
            for (int k = indexInNums2 + 1; k < nums2.length; k++) {
                if (nums2[k] > nums1[i]) {
                    nextGreater = nums2[k];
                    break;
                }
            }

            rez[i] = nextGreater;
        }

        return rez;
    }
}