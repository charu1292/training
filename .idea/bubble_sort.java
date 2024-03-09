public class bubble_sort {


    ///time complexity  is n2

    public void bubble_sort(int[] A){
        int n =A.length;
        for (int i=0;i<n-1;i++){
            for (int j=i+1;j<n;j++){
                if(A[i]>A[j]){
                    A[i]=A[i]+A[j];
                    A[j]=A[i]-A[j];
                    A[i]=A[i]-A[j];
                }
            }
        }
    }


    public static void main(String[] args) {
        bubble_sort ss=new bubble_sort();
        int A[]={22,44,525,2,1,8};
        ss.bubble_sort(A);
        for (int i : A) {
            System.out.print(i + " ");
        }
    }
}
