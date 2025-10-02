
class Leetcode3174 {

    public static void main(String[] args) {
        String s = "cb34";
        StringBuilder res = new StringBuilder(s);

        while (true) {
            boolean removed = false;
            for (int j = 0; j < res.length(); j++) {
                if (Character.isDigit(res.charAt(j))) {
                    res.deleteCharAt(j);
                    if (j - 1 >= 0) {
                        res.deleteCharAt(j - 1);
                    }
                removed = true;
                break;
                }
            }
            if (!removed) {
                break;
            }

        }

        System.out.println(res.toString());
    }
}
