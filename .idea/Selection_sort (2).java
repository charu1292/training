package cham_prac;

public class Selection_sort {
    public static void sort(int arr[]){
        int n= arr.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for (int j=i+1;j<n;j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            if (min!=i){
                arr[i]=arr[i]+arr[min];
                arr[min]=arr[i]-arr[min];
                arr[i]=arr[i]-arr[min];
            }
        }

    }

    public static void main(String[] args) {
//        Selection_sort ss=new Selection_sort();
        int arr[] ={5,2,6,8,3,9};
          sort(arr);
        for (int c = 0; c < arr.length; c++) {
            System.out.print(arr[c]+ " ");
        }
    }
}

