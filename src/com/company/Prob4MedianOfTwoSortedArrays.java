package com.company;


public class Prob4MedianOfTwoSortedArrays {

    private static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        return 0D;
    }

    private static double findMedianSortedArrays(int[] nums1, int[] nums2, int from, int to) {
        if (from > to) {
            return findMedianSortedArrays(nums2, nums1, 0, nums2.length - 1);
        }
        int m = nums1.length;
        int n = nums2.length;
        int des = (m + n - 1) / 2;
        int p = (from + to) / 2;
        int need = des - (p - 1);
        //需要num2里有恰有need个数比nums1[p]小
        if (need < 0) {
            return findMedianSortedArrays(nums1, nums2, from, p - 1);
        }
        if(need == 0){

        }

        if (nums2[need] < nums1[p]){
            return findMedianSortedArrays(nums1, nums2, from, p);
        }  else if (need == 0) {

        }

            return 0D;

    }
}
