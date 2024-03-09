public class largestnumberArray {

    //1.sort the array and last index is largest--time complexity of sort is Nlogn
    //2.time complexity of below big of N

    public static int largestnumber(int[] A) {
        int largest = A[0];
        for (int i = 0; i < A.length; i++) {
            if (A[i] > largest) {
                largest = A[i];
            }

        }
        return largest;
    }


    public static void main(String[] args) {
        int[] A = {3, 45, 12, 46, 98, 65, 88, 21};
        int n = A.length;
        int c = largestnumber(A);
        System.out.print(c);
    }
}
