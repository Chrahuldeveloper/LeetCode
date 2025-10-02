
class Leetcode3304 {

    public static void main(String[] args) {

        int k = 5;
        findChar('a', k);
    }

    static char findChar(char base, int k) {
        if (k == 1) {
            return base;
        }
        int len = 1;
        while (len < k) {
            len <<= 1;
        }

        int mid = len / 2;

        if (k <= mid) {
            return findChar(base, k);
        } else {
            return findChar(addNextChar(base), k - mid);
        }
    }

    static char addNextChar(char c) {
        if (c == 'z') {
            return 'a';
        }
        return (char) (c + 1);
    }

}
