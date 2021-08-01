package cs103.project;

// Longest Substring Without Repeating Characters
import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

    public int lengthOfLongestSubstring(String s) {

        int size = s.length();
        int maxLength = 0;
        int leftPointer=0;
        int rightPointer = 0;
        Set<Character> set = new HashSet();

        if (size == 0 || s == null) {
            return 0;
        }
        if (size == 1) {
            return 1;
        }

        while (rightPointer < s.length()) {
            if (set.contains(s.charAt(rightPointer))) {
                while (s.charAt(leftPointer) != s.charAt(rightPointer)) {

                    set.remove(s.charAt(leftPointer));
                    leftPointer++;
                }

                maxLength = Math.max(maxLength, rightPointer - leftPointer);
                leftPointer++;
                set.add(s.charAt(rightPointer));

            } else {
                maxLength = Math.max(maxLength, rightPointer - leftPointer + 1);
                set.add(s.charAt(rightPointer));
            }
            rightPointer++;
        }

        return maxLength;
    }

}
