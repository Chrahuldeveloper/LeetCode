class Leetcode1957 {

    public static void main(String[] args) {
        String s = "aaabaaaa";

        StringBuilder res = new StringBuilder(s);

        int count = 0;

        for (int i = 1; i < res.length(); i++) {
            if (res.charAt(i) == res.charAt(i - 1)) {
                count++;
                if (count == 3) {
                    res.deleteCharAt(i);
                    i--;
                    count = 2;
                }
            } else {
                count = 1;
            }
        }

        System.out.println(res.toString());

    }

}