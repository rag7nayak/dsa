package org.example.intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    private static int[][] merge(int[][] intervals){
        Arrays.sort(intervals,(a,b) ->
        {
            if(a[0]==b[0]){
                return Integer.compare(a[1],b[1]);
            }else{
                    return Integer.compare(a[0],b[0]);
                }
        });

        List<int[]> answer= new ArrayList<>();
        answer.add(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            int[] lastInterval= answer.get(answer.size()-1);
            int[] currrentInterval= intervals[i];

            if(currrentInterval[0]<=lastInterval[1]){
                int[] newInterval= new int[]{Math.min(lastInterval[0],currrentInterval[0]),Math.max(lastInterval[1],currrentInterval[1])};
                answer.remove(answer.size()-1);
                answer.add(newInterval);
            }else {
                answer.add(currrentInterval);
            }
        }

        int[][] finalAnswer= new int[answer.size()][2];
        for (int i = 0; i < answer.size(); i++) {
            finalAnswer[i][0]=answer.get(i)[0];
            finalAnswer[i][1]=answer.get(i)[1];
        }
        return finalAnswer;
    }
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] result = merge(intervals);

        for (int[] inter : result) {
            System.out.println("[" + inter[0] + "," + inter[1] + "]");
        }
    }

}
