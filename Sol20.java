import java.util.Stack;

class Sol20 {
    public static void main(String[] args) {

        String[] ops = { "5", "-2", "4", "C", "D", "9", "+", "+" };

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < ops.length; i++) {
            if (ops[i].equals("C")) {
                st.pop();
            } else if (ops[i].equals("D")) {
                int prevValue = st.peek();
                int Dvalue = prevValue * 2;
                st.push(Dvalue);
            } else if (ops[i].equals("+")) {
                int top1 = st.pop();
                int top2 = st.peek();
                st.push(top1);
                st.push(top1 + top2);
            }
            else {
                st.push(Integer.parseInt(ops[i]));
            }
        }

        int res = 0;
        for (int num : st) {
            res += num;
        }
        System.out.println(res);

    }
}