package org.example.intervals;

import java.util.Arrays;
import java.util.Comparator;

public class NonOverlappingIntervals {

    public static int eraseOverlapsEvents(int[][] intervals){
        if(intervals==null || intervals.length == 0){
            return 0;
        }
        Arrays.sort(intervals, Comparator.comparingInt(a ->a[1]));
        int count=0;

        int end= intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            int[] interval= intervals[i];
            if(interval[0]<end){
                count++;
            }else {
                end= interval[1];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Test case 1
        int[][] intervals1 = {{1,2},{2,3},{3,4},{1,3}};
        System.out.println("Erase count (expected 1): " + eraseOverlapsEvents(intervals1));

        // Test case 2
        int[][] intervals2 = {{1,2},{1,2},{1,2}};
        System.out.println("Erase count (expected 2): " + eraseOverlapsEvents(intervals2));

        // Test case 3
        int[][] intervals3 = {{1,2},{2,3}};
        System.out.println("Erase count (expected 0): " + eraseOverlapsEvents(intervals3));

        // Test case 4
        int[][] intervals4 = {{1,100},{11,12},{12,13},{13,14}};
        System.out.println("Erase count (expected 1): " + eraseOverlapsEvents(intervals4));
    }

}
