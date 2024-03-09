package questions;

public class SelectionSort {

    public static void SelectionSort(int[] A){
        int n=A.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n-1;j++){
                  if(A[min]>A[j]){
                      min=j;
                  }
                  if(min!=i){
                      A[i]=A[i]+A[min];
                      A[min]=A[i]-A[min];
                      A[i]=A[i]-A[min];
                  }

            }
        }


    }

    public static void main(String[] args) {
        int[] A={2,5,1,0,6,9,7};
         SelectionSort(A);
        for(int c=0;c<A.length;c++){
            System.out.print(A[c] + " ");
        }
    }
}
