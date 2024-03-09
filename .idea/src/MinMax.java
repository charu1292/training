package cham_prac;

/* Given an array A of size N. You need to find the sum of Maximum and Minimum element in the given array.

 *

 * NOTE: You should make minimum number of comparisons.

 *

 * Input Format

 * First and only argument is an integer array A of size N.

 *

 * Output Format

 * Return an integer denoting the sum Maximum and Minimum element in the given array.

 * Example Input

 * Input 1:

 *  A = [-2, 1, -4, 5, 3]

 * Example Output

 * Output 1:

 * 1

 * Example Explanation

 * Explanation 1:

 * Maximum Element is 5 and Minimum element is -4. (5 + (-4)) = 1.



 */


public class MinMax

{

    //Method to find max min sum

    public void MaxMin(int[] intArray )

    {   int min;
        int max;

        if(intArray[0]<intArray[1])   {
            min=intArray[0];
            max=intArray[1];
        }
        else {
            min=intArray[1];
            max=intArray[0];
        }
        int n=intArray.length;
        for (int i=2;i<n;i++){
            if (intArray[i]<min){
                min=intArray[i];
            }
            else if (intArray[i]>max){
                max=intArray[i];
            }

        }


        System.out.println("Min number "+ min );
        System.out.println("max number "+ max );

         int sum=min+max;

        System.out.println(sum);

    }
    public static void main(String[] args)

    {

        //Variable Declaration

        int[] intArray = new int[]{ -2, 1, -4, 5, 3};


        MinMax obj = new MinMax();

        obj.MaxMin(intArray );


    }

}





