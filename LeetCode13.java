import java.util.Hashtable;

public class LeetCode13 {

    public static void main(String[] args) {

        Character[] symbols = { 'I', 'V', 'X', 'L', 'C', 'D', 'M' };
        int[] nums = { 1, 5, 10, 50, 100, 500, 1000 };

        Hashtable<Character, Integer> romans = new Hashtable<Character, Integer>();

        for (int i = 0; i < nums.length; i++) {
            romans.put(symbols[i], nums[i]);
        }

        String s = "III";
        int res = 0;

        for (int i = 0; i < s.length(); i++) {
            int current = romans.get(s.charAt(i));
            int next = 0;

            if (i + 1 < s.length()) {
                next = romans.get(s.charAt(i + 1));
            }

            if (current < next) {
                res -= current;
            } else {
                res += current;
            }
        }

    }

}