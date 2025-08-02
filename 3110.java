class Solution {
    public int scoreOfString(String s) {

        ArrayList<Integer> values = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            int asciiValue = (int) s.charAt(i);
            values.add(asciiValue);
        }

        int sum = 0;
        for (int j = 0; j < values.size() - 1; j++) {

            int diff = Math.abs(values.get(j) - values.get(j + 1));
            sum += diff;

        }

       return sum;

    }
}