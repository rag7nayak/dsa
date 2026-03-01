package org.example.twopointermethod;

public class IsPallindrom {
    public boolean isPallindrom(String s){
        int left=0,right=s.length()-1;

        while (left<=right){
            char leftChar= Character.toLowerCase(s.charAt(left));
            char rightChar=Character.toLowerCase(s.charAt(right));
            if(!Character.isLetterOrDigit(leftChar)){
                left++;
            } else if (!Character.isLetterOrDigit(rightChar)) {
                right--;
            }else if (leftChar != rightChar){
                return false;
            }else {
                left++;
                right--;
            }
        }
        return true;
    }
    // 🔹 Test cases
    public static void main(String[] args) {
        IsPallindrom obj = new IsPallindrom();

        String s1 = "A man, a plan, a canal: Panama";
        System.out.println("Input: \"" + s1 + "\" → " + obj.isPallindrom(s1));
        // Expected: true

        String s2 = "racecar";
        System.out.println("Input: \"" + s2 + "\" → " + obj.isPallindrom(s2));
        // Expected: true

        String s3 = "hello";
        System.out.println("Input: \"" + s3 + "\" → " + obj.isPallindrom(s3));
        // Expected: false

        String s4 = "No lemon, no melon";
        System.out.println("Input: \"" + s4 + "\" → " + obj.isPallindrom(s4));
        // Expected: true

        String s5 = "";
        System.out.println("Input: \"" + s5 + "\" → " + obj.isPallindrom(s5));
        // Expected: true (empty string is trivially a palindrome)
    }
}

