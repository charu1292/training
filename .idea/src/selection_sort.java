public class selection_sort {


    ///time complexity  is n2
    public void sort(int A[]) {
        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (A[min] > A[j])
                    min = j;
            }

            if (min != i)
                A[i]=A[i]+A[min];
                A[min]=A[i]-A[min];
                A[i]=A[i]-A[min];
        }
    }


    public static void main(String[] args) {
        selection_sort ss=new selection_sort();
        int A[]={22,44,55,66,1,8};
        ss.sort(A);
        for (int i : A) {
            System.out.print(i + " ");
        }
    }
}