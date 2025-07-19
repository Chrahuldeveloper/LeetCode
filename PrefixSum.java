
public class PrefixSum {
    public static void main(String[] args) {



        int[] arr =  {2, 4, 6, 8, 10};

        int[] prefixSum = new int[arr.length];


        prefixSum[0] = arr[0];


        for (int i = 1; i < arr.length; i++) {
            
            prefixSum[i] = prefixSum[i-1] + arr[i]; 


        }


        for(int num:prefixSum){
            System.out.println(num);
        }



        int L = 0;
        int R = 3;
          int sum = 0;
        if (L == 0) {
            sum = prefixSum[R];
        } else {
            sum = prefixSum[R] - prefixSum[L - 1];
        }


        System.out.println(sum);



    }
}
