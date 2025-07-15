import java.util.ArrayList;

class Leetcode443 {
    public int compress(char[] chars) {

        ArrayList<String> res = new ArrayList<>();

        int count = 1;
        for (int i = 1; i <= chars.length; i++) {
            if (i < chars.length && chars[i] == chars[i - 1]) {
                count++;
            } else {
                res.add(String.valueOf(chars[i - 1]));
                if (count > 1) {
                    res.add(String.valueOf(count));
                }
                count = 1;
            }
        }

        int index = 0;
        for (String s : res) {
            for (char c : s.toCharArray()) {
                chars[index++] = c;
            }
        }

        return index;
    }
}
