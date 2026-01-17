package org.example.HashTable;


import java.util.Arrays;

public class ValidAnagram {
    private static boolean isAnagram(String str1, String str2){
        char[] ch1= str1.toCharArray();
        char[] ch2= str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);
    }
    public static void main(String[] args) {
        // Test case 1: Positive anagram
        String s1 = "listen";
        String s2 = "silent";
        System.out.println("Are '" + s1 + "' and '" + s2 + "' anagrams? " + isAnagram(s1, s2));
        // Expected: true

        // Test case 2: Negative case
        String s3 = "hello";
        String s4 = "world";
        System.out.println("Are '" + s3 + "' and '" + s4 + "' anagrams? " + isAnagram(s3, s4));
        // Expected: false

        // Test case 3: Same letters, different order
        String s5 = "triangle";
        String s6 = "integral";
        System.out.println("Are '" + s5 + "' and '" + s6 + "' anagrams? " + isAnagram(s5, s6));
        // Expected: true
    }

}
