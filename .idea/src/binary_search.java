package cham_prac;

public class Binary_search {
    //find a number in a given array iteratively
   public int Binary_search(int[] arr,int x, int s, int e) {

       while (s <= e) {
           int mid = s + (e - s) / 2;
           if (arr[mid]==x)
               return mid;
           else if (arr[mid]<x)
               s = mid + 1;
           else
           e = mid - 1;
       }
       return -1;
   }

    public static void main(String[] args) {
        Binary_search ob = new Binary_search();
        int[] arr = { 3, 4, 5, 6, 7, 8, 9 };
        int n = arr.length;
        int x = 9;
        int result = ob.Binary_search(arr, x, 0, n - 1);
        if (result == -1)
            System.out.println("Not found");
        else
            System.out.println("Element found at index " + result);
    }
}
