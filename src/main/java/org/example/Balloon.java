package org.example;

public class Balloon {
    /**
     * Given a string text, you want to use the characters of text
     * to form as many instances of the word "balloon" as possible.
     * You can use each character in text at most once.
     * Return the maximum number of instances that can be formed.
     * <p>
     * Example 1:
     * Input: text = "nlaebolko"
     * Output: 1
     * <p>
     * Example 2:
     * Input: text = "loonbalxballpoon"
     * Output: 2
     * <p>
     * Example 3:
     * Input: text = "leetcode"
     * Output: 0
     * <p>
     * Constraints:
     * 1 <= text.length <= 104
     * text consists of lower case English letters only.
     */
    public int maxNumberOfBalloons(String text) {
        int b = 0;
        int a = 0;
        int l = 0;
        int o = 0;
        int n = 0;
        for (int i = 0; i < text.length(); i++) {
            switch (text.charAt(i)) {
                case 'b' -> b++;
                case 'a' -> a++;
                case 'l' -> l++;
                case 'o' -> o++;
                case 'n' -> n++;
            }
        }
        int count = 0;
        while (b > 0 && a > 0 && l > 1 && o > 1 && n > 0) {
            b--;
            a--;
            l -= 2;
            o -= 2;
            n--;
            count++;
        }
        return count;
    }
}
