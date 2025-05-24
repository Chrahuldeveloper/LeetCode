import java.util.ArrayList;

class Sol6{
    public static void main(String[] args) {
        
        String[] strs = {"leet","code"};

        String x = "e";

        ArrayList<Integer> indexs = new ArrayList<>();

        for(int i = 0;i<strs.length;i++){

            if(strs[i].contains(String.valueOf(x))){
                indexs.add(i);
            }
        }
        System.out.println(indexs);

    }
}