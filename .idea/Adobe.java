package cham_prac;
/* Write a program to search an element in the list*/

public class Adobe
{
    //Method to search an element in the list
    public int search(int[] A , int num){
        int s=0;
        int e=A.length-1;
        while(s<=e) {
        int mid =s+(e-s) / 2;
        if (A[mid] == num)
            return mid;
        else if (A[mid] < num)
            s = mid + 1;
        else
            e=mid - 1;
    }
    return -1;

    }

    public static void main(String[] args)
    {
        //Variable Declaration
        int[] A = new int[]{ 2,4,5,12,45,66,75,85,90};
        int num = 2;

        //Method Call
        Adobe obj = new Adobe();
        int c = obj.search(A, num);
        if(c==-1){
            System.out.println("Number is not in list");

        }
        else {
        System.out.println("Number at this pos " + c);}
    }
}