public class name_Ntimes_recurssion {

    public static  void print_names(int i, int n){
        // Base Condition.
        if(i>n) return;
        System.out.println("Chaman");

        // Function call to print till i increments.
        print_names(i+1,n);

    }


    //wrt to  print numbers lineraly 1 2 3 4 ...10
    public static  void print_numbers(int i, int n){
        // Base Condition.
        if(i>n) return;
        System.out.print(i + " ,");

        // Function call to print till i increments.
        print_numbers(i+1,n);


    }

    // print in opposite order
    public static  void opp_order(int i, int n){
        // Base Condition.
        if(i<1) return;
        System.out.print(i + ",");

        // Function call to print till i increments.
        opp_order(i-1,n);


    }

    public static void main(String[] args) {

        // Here, let’s take the value of n to be 4.
        int n = 4;
        print_names(1,n);
        print_numbers(1,n);
        System.out.println();
        opp_order(n,n);
    }
}
