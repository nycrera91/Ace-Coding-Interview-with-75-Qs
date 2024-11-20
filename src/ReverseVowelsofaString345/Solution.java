package ReverseVowelsofaString345;

import java.util.List;

class Solution {
    public String reverseVowels(String s) {
        List<String> vowels = List.of("A", "a", "E", "e", "I", "i", "O", "o", "U", "u");

        char[] list = s.toCharArray();

        int start = 0;
        int end = list.length - 1;

        while(start < end) {

            if(!vowels.contains(String.valueOf(list[start]))) {
                start++;
                continue;
            }

            if(!vowels.contains(String.valueOf(list[end]))) {
                end--;
                continue;
            }

            char temp = list[start];
            list[start] = list[end];
            list[end] = temp;
            start++;
            end--;

        }

        return String.valueOf(list);

    }
}
