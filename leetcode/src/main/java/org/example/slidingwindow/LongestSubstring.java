package org.example.slidingwindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LongestSubstring {
    public int lengthOfLongestSubString(String s){
        int ans=0,n= s.length(),sp=0, fp=0;
        Map<Character,Integer> mp= new HashMap<>();

        while (sp<n){
            addToMap(mp,s.charAt(sp));
            while (fp<sp && !isValidStr(mp)){
                deleteFromMap(mp,s.charAt(sp));
                fp++;
            }
            int length= sp-fp+1;
            ans= Math.max(ans,length);
            sp++;
        }

return ans;
    }

    private void deleteFromMap(Map<Character, Integer> mp, char c) {
       mp.put(c,mp.getOrDefault(c,0)-1);
    }

    private boolean isValidStr(Map<Character, Integer> mp) {
        for (char c:mp.keySet()) {
            if(mp.get(c)>1){
                return false;
            }
        }
        return true;
    }

    private void addToMap(Map<Character, Integer> mp, char c) {
        mp.put(c,mp.getOrDefault(c,0)+1);
    }

    public static void main(String[] args) {
        LongestSubstring obj = new LongestSubstring();

        System.out.println(obj.lengthOfLongestSubString("abcabcbb")); // Expected 3 ("abc")
        System.out.println(obj.lengthOfLongestSubString("bbbbb"));    // Expected 1 ("b")
        System.out.println(obj.lengthOfLongestSubString("pwwkew"));   // Expected 3 ("wke")
        System.out.println(obj.lengthOfLongestSubString(""));         // Expected 0
        System.out.println(obj.lengthOfLongestSubString("abcdef"));   // Expected 6 ("abcdef")
    }

}
