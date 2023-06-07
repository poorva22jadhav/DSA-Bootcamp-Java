package com.kunal;
// https://leetcode.com/problems/richest-customer-wealth/
 class MaxWealth {
    public static void main(String[] args) {
         int array[][]={{21,23,45},{12,3,4}};
         System.out.println(maximumWealth(array));
    }
    public static int maximumWealth(int[][] accounts) {
        // person = rol
        // account = col
        int ans = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            // when you start a new row, take a new sum for that row
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            // now we have sum of accounts of person
            // check with overall ans
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
