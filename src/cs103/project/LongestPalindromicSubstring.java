package cs103.project;

/*
Dat je string s, vratiti najduži podstring palindrom u stringu s.
 */
public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {

        int leftPointer = 0, rightPointer = 0;

        if (s == null || s.length() < 1) {
            return "";
        }
        if (s.length() == 1) {
            return s;
        }

        for (int i = 0; i < s.length(); i++) {
            int odd = expendCenter(s, i, i);
            int even = expendCenter(s, i, i + 1);

            int maxLength = Math.max(odd, even);

            if (maxLength > rightPointer - leftPointer) {

                leftPointer = i - (maxLength - 1) / 2;
                rightPointer = i - maxLength / 2;
            }
        }

// substring method doesn't include last character, so we need to increment rightPointer by 1
        return s.substring(leftPointer, rightPointer + 1);
    }

    public int expendCenter(String s, int startPointer, int endPointer) {

        int size = s.length();
        while (startPointer >= 0 && endPointer < size
                && s.charAt(startPointer) == s.charAt(endPointer)) {
            startPointer--;
            endPointer++;
        }
        return endPointer - startPointer - 1;
    }
}
