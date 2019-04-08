/*
 * NAME: Zhaoyi Guo
 * PID: A15180402
 */
/**
 * class Startup consists of 7 methods
 */
public class Startup {
    /**
     * This method takes in an array of integers
     * and returns the second largest element in this array.
     */
    public static int secondMax(int[] a) {
        if (a.length <= 1) {
            return Integer.MAX_VALUE;
        }
        for (int i = 0; i < a.length - 1; i++) {
            // This writes to the current line
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        int two = 2;
        return a[a.length - two];
    }

    /**
     * This method takes in an array of integers
     * and returns the most frequent value in this array.
     */
    public static int mostFreqInt(int[] a) {
        int max_elem = 0;
        int min_elem = 0;
        int[] pos_a;
        int[] neg_a;
        int result_count = 0;
        int result_index = 0;
        for (int z = 0; z < a.length; z++){
            if (a[z] < min_elem) {
                min_elem = a[z];
            }
            if (a[z] > max_elem) {
                max_elem = a[z];
            }
        }
        pos_a = new int[max_elem + 1];
        neg_a = new int[-min_elem + 1];
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 0) {
                pos_a[a[i]] += 1;
            }
            if (a[i] <= 0 && min_elem < 0) {
                neg_a[-a[i]] += 1;
            }
        }
        for (int j = 0; j < a.length; j++) {
            if (a[j] >= 0 && result_count < pos_a[a[j]]) {
                result_count = pos_a[a[j]];
                result_index = a[j];
            }
            if (a[j] < 0 && result_count < neg_a[-a[j]]) {
                result_count = neg_a[-a[j]];
                result_index = a[j];
            }
        }
        return result_index;
    }
//    /**
//     * This method takes in an array of integers
//     * and returns a new array that contains
//     * the elements of the input array
//     * where: all the even numbers come before
//     * all the odd numbers.
//     */
    public static int[] rearrange(int[] a) {
        int two = 2;
        int front = 0;
        int back = a.length - 1;
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (a[i] % two == 1) {
                result[back] = a[i];
                back--;
            } else {
                result[front] = a[i];
                front++;
            }
        }
        return result;
    }

    //    /**
//     * This method takes in a sorted array
//     * (You can assume the given array is always sorted).
//     * It should modify the given array and remove the duplicates
//     * such that each element only appears once at the beginning
//     * and return the number of unique elements in the new array.
//     */
    public static int removeDuplicates(int[] a) {
        if (a.length == 0) {
            return 0;
        }

        int j = 1;
        for (int i = 1; i < a.length; i++) {
            if (a[i - 1] != a[i]) {
                a[j] = a[i];
                j++;
            }
        }
        return j;
    }

    //    /**
//     * This method takes in an array of non-negative integers,
//     * where the element at index i is the price of a stock on day i.
//     * If you were only allowed to complete at most one transaction,
//     * which means you can only buy a stock once and then sell it once,
//     * design a method to return the maximum profit.
//     */
    public static int maxProfitOne(int[] a) {
        int max = 0;
        int min = a[0];
        int profit = 0;
        for (int i = 1; i < a.length - 1; i++) {
            if (a[i] < min) {
                min = a[i];
            }
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] > max && a[j] > min) {
                    max = a[j];
                }
            }
            if ((max - min) > profit) {
                profit = max - min;
            }
        }
        return profit;
    }

    //    /**
//     * This method takes in an array of non-negative integers,
//     * where the element at index i is the price of a stock on day i.
//     * If you were now allowed to complete as many transactions as you want,
//     * design a method to return the maximum profit.
//     */
    public static int maxProfitMany(int[] a) {
        int profit = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] < a[i + 1]) {
                profit = profit + a[i + 1] - a[i];
            }
        }
        return profit;
    }

        /**
     * This method takes in an array of non-negative integers.
     * You are initially positioned at the first index of the array.
     * Each element in the array is the maximum jump length at that index.
     * For example, if the element at index 2 is 4, then you can jump 0 to 4 steps from index 2.
     * Return true if you are able to reach the last index, false otherwise.
     */
    public static boolean jumpGame(int[] a) {
        int max_reach = 0;
        for (int i = 0; i < a.length; i++) {
            if (max_reach < i) {
                break;
            }
            if (max_reach < a[i] + i) {
                max_reach = a[i] + i;
            }
        }
        return max_reach >= a.length-1;
    }
}
