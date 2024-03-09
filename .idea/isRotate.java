package cham_prac;

public class isRotate {

    public  void rotate(int[] arr, int k) {

        while (k != 0) {
            int t = arr[0];
            for(int i = 1; i < arr.length; i++) {
                arr[i - 1] = arr[i];
            }
            arr[arr.length - 1] = t;
            k--;
        }
    }

    public static void main(String[] args) {
        int[] arr={2,77,9,10,6,33};
        int k=2;
        isRotate rotate=new isRotate();
        rotate.rotate(arr,k);
        for (int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i] + " ");
        }

    }
}
