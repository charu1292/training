package questions;

import cham_prac.Checksum;

import java.util.Arrays;

//find if there are two numbers in an array that sum to a given number
public class CheckSum {
    public static void Checksum(int[] A,int k ){
        Arrays.sort(A);
        if (A==null||A.length==1){
            System.out.println("Array have no or 1 element only");
            return;
        }
        for (int i=0,j=A.length-1;i<j;i++,j--) {
            if ((A[i] + A[j]) == k) {
                System.out.println("pair found " + A[i] + " : " + A[j]);
            } else if ((A[i] + A[j]) > k) {
                j--;
            } else if ((A[i] + A[j]) < k) {
                i++;
            } else System.out.println("No pair found");
        }
    }


    public static void main(String[] args) {
         int[] A ={1,2,8,9,-1,28,11};
         int k=10;
        Checksum(A,k);

    }

}
