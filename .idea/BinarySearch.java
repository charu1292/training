package questions;

public class BinarySearch {

    public int BinarySearch(int[] A,int x,int s,int e){
        while(s<=e) {
            int mid = s + (e - s) / 2;
            if(A[mid]==x){
                return mid;
            }
            else if (A[mid]<x){
                s=mid+1;
            }
            else e=mid-1;
        }
        return -1;

    }


    public static void main(String[] args) {
        BinarySearch b=new BinarySearch();
        int[] A={2,22,33,44,66,88,99};
        int x=33;
        int s=0;
        int e=A.length-1;
        int result=b.BinarySearch(A,x,s,e);
        if(result==-1){
            System.out.println("Number NOt present in array");
        }
        else System.out.println("number present at index " + result);

    }
}


