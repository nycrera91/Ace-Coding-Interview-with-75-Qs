package GreatestCommonDivisorofStrings1071;

class Solution {

    // Solution: https://www.youtube.com/watch?v=41iKYE0n0PQ

    public static void main(String[] args) {

        String s = gcdOfStrings("AB", "ABABAB");
        System.out.println(s);
    }

    public static String gcdOfStrings(String str1, String str2) {

        if(str1.length() < str2.length()) {
            return gcdOfStrings(str2, str1);
        }

        if(str1.equals(str2)) {
            return str1;
        }

        if(str1.startsWith(str2)) {
            return gcdOfStrings(str1.substring(str2.length()), str2);
        }

        return "";
    }
}