//Count Elements With Maximum Frequency

import java.util.ArrayList;
import java.util.Arrays;

// You are given an array nums consisting of positive integers.
//
//Return the total frequencies of elements in nums such that those elements all have the maximum frequency.
//
//The frequency of an element is the number of occurrences of that element in the array
public class MaxFrequency1 {
    public static int maxFrequencyElements(int[] nums) {
        int[] arr = new int[101];
        int temp = 0;
        for (int num : nums) {
            arr[num]++;
        }
        int max = -1;
        System.out.println(Arrays.toString(arr));
        // find the total of max frequency
        for (int i = 0; i < arr.length; i++) {
            // find max elements or if equal then add
            System.out.println("arr[i] = " + arr[i] + " max = " + max);
            if (arr[i]>max){
                max = Math.max(max,arr[i]);
                temp = max;
                System.out.println("max = " + max);
            } else if (arr[i] == max) {
                System.out.println("equal maxes" + max + " " + arr[i]);
                temp += arr[i];
            }
        }
        return temp;
    }

    public static void main(String[] args) {

        int[] arr = {10,12,11,9,6,19,11};
        System.out.println(maxFrequencyElements(arr));
    }
}
