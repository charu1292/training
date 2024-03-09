package questions;

public class leftrotate {

    void leftrotate(int[] A, int d) {
        for (int i = 0; i<d; i++) {
            leftrotatebyone(A);
        }

    }


    void leftrotatebyone(int[] A) {
        int temp = A[0];
        for (int i = 0; i < A.length - 1; i++) {
            A[i] = A[i + 1];
        }
        A[A.length-1]=temp;

    }


    public static void main(String[] args) {
        int[] A = {1, 2, 4, 5, 6, 7, 8};
        int d = 2;
        leftrotate rotate = new leftrotate();
        rotate.leftrotate(A,d);
        for (int i = 0; i < A.length; i++) {

                    System.out.print(A[i] +" ");
        }
    }
}
