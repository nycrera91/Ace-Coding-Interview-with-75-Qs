package ReverseWordsinaString151;

class Solution {

    public static void main(String[] args) {
        System.out.println(reverseWords("a good   example"));
    }

    public static String reverseWords(String s) {

        String[] split = s.trim().split("\\s+");

        StringBuilder result = new StringBuilder();

        for(int i = split.length - 1; i > 0; i--){
            result.append(split[i]).append(" ");
        }

        return result + split[0];
    }
}
