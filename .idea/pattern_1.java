public class pattern_1 {

    public static void pattern_print()
    {
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
            pattern_print();;
    }
}