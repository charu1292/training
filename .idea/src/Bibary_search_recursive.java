package cham_prac;

public class Bibary_search_recursive {

    //find a number in a given array recursively
    public int Binary_search(int[] arr,int x, int s, int e) {
       if (e>=s){
           int mid=s+(e-s)/2;
           if (arr[mid]==x)
               return mid;
           if (arr[mid] > x)
               return Binary_search(arr, x, s, mid - 1);

           return Binary_search(arr, x, mid + 1, e);
       }
    return -1;
    }


    public static void main(String[] args) {
        Bibary_search_recursive ob = new Bibary_search_recursive();
        int[] arr = { 3, 4, 5, 6, 7, 8, 9 };
        int n = arr.length;
        int x = 10;
        int result = ob.Binary_search(arr, x, 0, n - 1);
        if (result == -1)
            System.out.println("Not found");
        else
            System.out.println("Element found at index " + result);
    }
}

