package org.example.slidingwindow;

public class LongestRepeatingChReplacement {

    public int characterReplacement(String s,int k){
        int n= s.length();
        int[] count= new int[26];
        int maxCount=0;
        int maxLength=0;
        int start= 0;
        for (int end = 0; end < n; end++) {
            maxCount= Math.max(maxCount,++count[s.charAt(end)-'A']);
            while (end-start+1-maxCount>k){
              count[s.charAt(start)-'A']--;
              start++;
            }
            maxLength= Math.max(maxLength,end-start+1);
        }
        return maxLength;
    }
    public static void main(String[] args) {
        LongestRepeatingChReplacement obj = new LongestRepeatingChReplacement();

        String s1 = "ABAB";
        int k1 = 2;
        System.out.println("Input: " + s1 + ", k=" + k1 + " → " + obj.characterReplacement(s1, k1));
        // Expected: 4 (replace 2 'A' with 'B' or vice versa → "BBBB")

        String s2 = "AABABBA";
        int k2 = 1;
        System.out.println("Input: " + s2 + ", k=" + k2 + " → " + obj.characterReplacement(s2, k2));
        // Expected: 4 ("AABA" or "ABBA")

        String s3 = "AAAA";
        int k3 = 2;
        System.out.println("Input: " + s3 + ", k=" + k3 + " → " + obj.characterReplacement(s3, k3));
        // Expected: 4 (already all same)

        String s4 = "ABCDE";
        int k4 = 1;
        System.out.println("Input: " + s4 + ", k=" + k4 + " → " + obj.characterReplacement(s4, k4));
        // Expected: 2 (any two same after one replacement)

        String s5 = "";
        int k5 = 2;
        System.out.println("Input: \"" + s5 + "\", k=" + k5 + " → " + obj.characterReplacement(s5, k5));
        // Expected: 0 (empty string)
    }
}

