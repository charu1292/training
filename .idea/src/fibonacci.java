package cham_prac;

public class fibonacci {
     // find nth fibanacci series
    static int fabonacci_series(int n){
        return (n<=2?n:(fabonacci_series(n-1)+fabonacci_series(n-2)));}



    public static void main(String[] args) {
       int n=5;
       // print fabaniic number at 5 th place
        System.out.println(fabonacci_series(n));

        ///to print facbanacci to n th numbers
        for(int i = 0; i < n; i++){
            System.out.print(fabonacci_series(i) + " " );}
        }
    }

