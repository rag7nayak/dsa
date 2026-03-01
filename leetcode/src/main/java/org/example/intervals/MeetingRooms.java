package org.example.intervals;

import java.util.Arrays;
import java.util.Comparator;

import static java.lang.Integer.compare;

public class MeetingRooms {
    public boolean canAttendMeetings(int[][] intervals){
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        for (int i = 1; i < intervals.length; i++) {
            if(intervals[i-1][1]>intervals[i][0]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        MeetingRooms obj = new MeetingRooms();

        int[][] intervals1 = {{0, 30}, {5, 10}, {15, 20}};
        System.out.println(obj.canAttendMeetings(intervals1)); // false

        int[][] intervals2 = {{7, 10}, {2, 4}};
        System.out.println(obj.canAttendMeetings(intervals2)); // true
    }

}
