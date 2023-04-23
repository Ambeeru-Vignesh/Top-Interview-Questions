class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n1 = nums1.length;
        int n2 = nums2.length;

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int[] nums3 = new int[n1 + n2];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < n1 && j < n2) {
            if (nums1[i] < nums2[j]) {
                nums3[k] = nums1[i];
                k++;
                i++;
            } else {
                nums3[k] = nums2[j];
                k++;
                j++;
            }
        }

        while (i < n1) {
            nums3[k++] = nums1[i++];
        }

        while (j < n2) {
            nums3[k++] = nums2[j++];
        }

        int n3 = nums3.length;
        int first = 0;
        int last = nums3.length - 1;

        if (n3 % 2 == 1) {
            int index = (n3 + 1) / 2;
            double value = nums3[index - 1];
            return value;
        } else {
            int index = n3 / 2;
            double value = (double) (nums3[index - 1] + nums3[index]) / 2;
            return value;
        }

    }
}