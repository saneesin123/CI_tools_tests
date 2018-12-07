/*
Algorithm:
Data member – array itself and the method as sum array with integer as return type.
•	Declare, construct and initialize an array.
o	Array variable is sumArray and the data type is int and it’s a fixed size array of 5 elements as 1,2,3,4,5.
•	Using a for loop, add the elements of the array and return the sum.
 */
public class sumArray {
    public static void main(String args[]) {

        //data members
        int[] array1 = {2, 3, 4, 5, 6 };
        int sum = 0;
        int i;
        //methods - sum elements in an array
        for (i = 0; i < array1.length; i++) {
            sum += array1[i];

        }
        System.out.println("The sum of the array is " + sum);

    }
}
